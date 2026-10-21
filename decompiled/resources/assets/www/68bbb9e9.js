import{H as t,cT as e,ds as i,bJ as a,d8 as s,aj as o,ch as n,fw as r,fx as l,fy as d,dZ as c,fz as h,fA as p,an as m,eq as u,V as v,z as g,a8 as b,ab as y,L as _,ak as $,h as f,fB as k,d9 as w,fC as x,ac as T,ad as S,as as C,a as D,aD as E,i as M,aS as P,av as L,ap as R,bx as I,aY as A,dJ as V,dp as B,ci as O,ah as F,aX as H,cU as N,bF as z,aN as U,cF as q,dL as j,et as W,ck as J,bf as G,aW as X,br as Y,b3 as K,cv as Z,cw as Q}from"./952f98a9.js";import{M as tt,R as et,S as it,u as at,D as st,T as ot,w as nt,v as rt,x as lt,G as dt,a5 as ct,a1 as ht,V as pt,O as mt,z as ut,N as vt,a6 as gt,f as bt,K as yt,a2 as _t,P as $t,H as ft,e as kt,E as wt,I as xt,Q as Tt,h as St,a3 as Ct,a4 as Dt,ao as Et,an as Mt,ah as Pt,av as Lt,au as Rt}from"./216055dc.js";import{aI as It,bf as At,bg as Vt,aH as Bt,bQ as Ot,bP as Ft}from"./7f3d7ca9.js";import{b as Ht,B as Nt}from"./30ef6f1f.js";import{c as zt,b as Ut,B as qt,a as jt}from"./e3d898b2.js";import{b as Wt,B as Jt,a as Gt}from"./77df3611.js";import{b as Xt,B as Yt}from"./6b902eda.js";import{b as Kt,B as Zt}from"./2fc6c95e.js";import{b as Qt,B as te}from"./1e9ee395.js";import{b as ee,B as ie}from"./b0866b92.js";import{b as ae,B as se}from"./1f3b5ecf.js";import{d as oe,c as ne,B as re,a as le}from"./ff7f0130.js";import{b as de,B as ce}from"./187e605b.js";import{b as he}from"./5f793025.js";import{B as pe,a as me}from"./0f94a5c2.js";import"./e5f89cd9.js";import{H as ue}from"./e7d77b44.js";import{b as ve,B as ge}from"./ab4d0dcb.js";import{O as be}from"./f891897b.js";import{B as ye}from"./8be85cc5.js";import"./ff2cdeea.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./854beed0.js";import"./84dff06e.js";import"./be12d7a2.js";import"./72e6e777.js";import"./5aa1c2be.js";import"./dd13577a.js";const _e=t((t=>class extends t{_dispatchEvent(t,e={}){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_handleOnMenuIconClick(t){this._dispatchEvent("payments-mpos-overview-app-menu-click",t)}})),$e=["charge","manage-links","search-movements","see-more-actions","search-by-id"],fe="YYYY-MM-DD",ke="DD MMMM YYYY",we="DD MMM YYYY",xe="DD/MM/YYYY",Te="HH:mm",Se="YYYY-MM-DD HH:mm",Ce="YYYY-MM-DD HH:mm:ss.SSS",De={day:"2-digit",month:"long",year:"numeric"},Ee={day:"2-digit",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit"},Me="canceled-charge",Pe="disabled-bluetooth",Le="execute-charge",Re="limit-exceeded",Ie="no-binded-reader",Ae="refused-bluetooth",Ve="share-link-voucher",Be="unavailable-refund",Oe="unavailable-top",Fe="payments-mpos-overview",He="refund",Ne="payment",ze={available:"default",expired:"error",canceled:"error",cancelled:"error",failed:"error",processed:"success"},Ue="available",qe="expired",je="cancelled",We="processed",Je="cancelled",Ge="completed",Xe="failed",Ye="refund",Ke="left",Ze="calculator",Qe="dashboard",ti="transaction",ei="link",ii={[ti]:{completed:[{icon:e(),action:"receipt-share"},{icon:i(),action:"payment-voucher-share"},{icon:a(),action:"money-return"}],failed:[{icon:e(),action:"receipt-share"}],cancelled:[{icon:e(),action:"receipt-share"},{icon:i(),action:"payment-voucher-share"}],refund:[{icon:e(),action:"receipt-share"},{icon:i(),action:"payment-voucher-share"}]},[ei]:{processed:[{icon:e(),action:"receipt-share"}],available:[{icon:e(),action:"receipt-share"},{icon:s(),action:"payment-link-send"},{icon:o(),action:"link-cancel"},{icon:n(),action:"date-edit"}],expired:[{icon:e(),action:"receipt-share"}],cancelled:[{icon:e(),action:"receipt-share"}]}},ai=[{icon:r(),action:"button-charge"},{icon:l(),action:"button-manage-links"},{icon:d(),action:"button-search-movements"},{icon:c(),action:"button-search-by-id"}],si="full",oi="transparent",ni={PRESENT_CARD:{id:"PRESENT_CARD",icon:h()},PAYMENT_LINK:{id:"PAYMENT_LINK",icon:l()},TAP_ON_PHONE:{id:"TAP_ON_PHONE",icon:p()}},ri={hours:11,minutes:55},li="mercurioMPOS",di="mercurioJWS",ci={bluetoothError:{name:`${Fe}-action-footprint`,detail:{view:"bluetooth-error"}},executeChargeError:{name:`${Fe}-call-action-error-execute-charge-open`,detail:{view:"charge-error"}},initTopError:{name:`${Fe}-action-footprint`,detail:{view:"init-top-unavailable-error"}},executeChargeTopLimitError:{name:`${Fe}-action-footprint`,detail:{view:"execute-charge-top-limit-error"}},executeChargeNoReadedCardError:{name:`${Fe}-action-footprint`,detail:{view:"execute-charge-no-readed-card-error"}},executeChargeNoValidCardError:{name:`${Fe}-action-footprint`,detail:{view:"execute-charge-no-valid-card-error"}},executeChargeInsufficientBalanceError:{name:`${Fe}-action-footprint`,detail:{view:"execute-charge-insufficient-balance-error"}},refundUnavailableError:{name:`${Fe}-action-footprint`,detail:{view:"refund-unavailable-error"}},initTopCommonError:{name:`${Fe}-action-footprint`,detail:{view:"init-top-common-error"}}},hi={PAYMENT_LINK:"PAYMENT_LINK",PRESENT_CARD:"MPOS",TAP_ON_PHONE:"TAP_ON_PHONE"},pi="scan-devices",mi="execute-charge",ui="execute-charge-top",vi="connect-device",gi="transaction-refund",bi="link-refund",yi="top-refund",_i="share-link-voucher",$i="top-init",fi=["TAP_ON_PHONE","PRESENT_CARD","PAYMENT_LINK"],ki="charge",wi="refund",xi="cancel",Ti={TAP_ON_PHONE:{paymentMethods:{PRESENT_CARD:"TAP_ON_PHONE"}},MPOS:{paymentMethods:{PRESENT_CARD:"PRESENT_CARD",PAYMENT_LINK:"PAYMENT_LINK"}}},Si="^[a-zA-Z0-9\\._\\-*\\&#\\$+\\^~]+@([a-zA-Z0-9\\-_]+\\.)+[a-zA-Z]{2,}$",Ci="^[!-πÀ-ÿ‘-•‰‹›⁄€™∂∏∑√∫≈≠≤≥◊ﬂ–∞…∆ﬁ—\\s]{0,255}$",Di=t=>t.length,Ei=(t,e,i)=>moment(t).locale(e).format(i),Mi=()=>moment(),Pi=()=>Mi().format(fe),Li=t=>moment().subtract(t,"days").format(fe),Ri=()=>moment.utc().add(1,"days").set({hour:1,minute:0,second:0,millisecond:0}).toISOString(),Ii=t=>!t||moment().isAfter(moment(t)),Ai=(t,e)=>moment(t).isAfter(moment(e)),Vi=t=>moment(t).format(Se),Bi=()=>Ei(Mi(),"es",Ce).replaceAll(":","."),Oi=t=>t.length>1?t.map((t=>`${t.description} (${t.units})`)).join(", "):t[0].description,Fi=(t,e,i)=>`${i} ${1===t&&1===e?"":`(${e})`}`,Hi=(t,e)=>t.map((t=>({...t,label:e.t(`${e.constructor.is}-${t.action}`)}))),Ni={default:{customErrorData:{buttonText:`${Fe}-sdk-error-modals-understood`,buttonEvent:{name:`${Fe}-sdk-error-modals-user-close`},description:`${Fe}-sdk-error-modals-common-error-modal-message`,fullHeight:!1,headerText:`${Fe}-sdk-error-modals-default-header-text`}},unfinishOperative:{customErrorData:{buttonText:`${Fe}-error-modal-bt-label-accept`,buttonEvent:{name:`${Fe}-sdk-error-modals-user-close`},description:`${Fe}-modal-unfinished-operation-error`,headerText:`${Fe}-sdk-error-modals-default-header-text`,fullHeight:!0}},unavailableInformation:{customErrorData:{buttonText:`${Fe}-error-modal-bt-label-accept`,buttonEvent:{name:`${Fe}-sdk-error-modals-user-close`},description:`${Fe}-modal-unavailable-information-error`,headerText:`${Fe}-sdk-error-modals-default-header-text`,fullHeight:!0}},operationError:{customErrorData:{buttonText:`${Fe}-modal-operation-error-button`,buttonEvent:{name:`${Fe}-modal-operation-error-accept`},description:`${Fe}-modal-operation-error-description`,title:`${Fe}-modal-operation-error-title`,headerText:`${Fe}-modal-operation-error-header`,fullHeight:!0}},commonErrorUnavailableInformation:{customErrorData:{errorId:`${Fe}-custom-sdk-common-error`,errorType:"operative",customConfig:{acceptBtLabel:`${Fe}-error-modal-bt-label-accept`,message:`${Fe}-modal-unavailable-information-error`,header:`${Fe}-error-info-not-loaded-header`,fullModal:!0,className:"error dark-header header-button-to-left"},headerText:`${Fe}-sdk-error-modals-default-header-text`}}},zi=({operationType:t,componentName:e,isRefund:i})=>({[vi]:[{buttonText:`${e}-refused-location-button-text`,description:`${e}-refused-location-description-text`,errorCodes:[{code:720}],headerText:`${e}-default-header-text`,panelInfoHeadingTitle:"L",imageSize:"24",title:`${e}-refused-location-title`,buttonEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"location_source"}}},{buttonText:`${e}-disabled-bluetooth-button-text`,description:`${e}-disabled-bluetooth-description`,errorCodes:[{code:702}],headerText:`${e}-default-header-text`,imageSize:"24",linkText:`${e}-disabled-bluetooth-link-text`,panelInfoHeadingTitle:"L",title:`${e}-disabled-bluetooth-title`,type:Pe,buttonEvent:{name:`${e}-retry-connect-to-bluetooth-device-call`,shouldShowSpinner:!0},linkEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"bluetooth"}}},{analyticsEvent:ci.bluetoothError,buttonText:`${e}-refused-bluetooth-button-text`,description:`${e}-refused-bluetooth-description-text`,errorCodes:[{code:702}],headerText:`${e}-default-header-text`,imageSize:"24",panelInfoHeadingTitle:"L",title:`${e}-refused-bluetooth-title`,type:Ae,noMoreRetriesModal:!0,buttonEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"application_settings"}},linkEvent:{name:`${e}-user-close`}},{analyticsEvent:ci.bluetoothError,buttonText:`${e}-refused-bluetooth-button-text`,description:`${e}-refused-bluetooth-description-text`,errorCodes:[{code:721}],headerText:`${e}-default-header-text`,imageSize:"24",panelInfoHeadingTitle:"L",title:`${e}-refused-bluetooth-title`,type:Ae,buttonEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"application_settings"}},linkEvent:{name:`${e}-user-close`}},{buttonText:`${e}-default-retry`,description:`${e}-no-binded-reader-description-text`,errorCodes:[{code:801}],fullHeight:!0,headerText:`${e}-default-header-text`,linkText:`${e}-no-binded-reader-link-text`,title:`${e}-no-binded-reader-title`,buttonEvent:{name:`${e}-retry-connect-to-bluetooth-device-call`,shouldShowSpinner:!0},linkEvent:{name:i?`${e}-refund-new-devices-scan`:`${e}-new-devices-scan`,shouldShowSpinner:!0},type:Ie},{analyticsEvent:ci.bluetoothError,buttonText:`${e}-no-binded-reader-${i?"refund-":""}max-retries-button-text`,description:`${e}-no-binded-reader-max-retrys-description-text`,errorCodes:[{code:801}],fullHeight:!0,headerText:`${e}-default-header-text`,linkText:"",title:`${e}-no-binded-reader-max-retrys-title`,buttonEvent:{name:i?`${e}-user-close`:`${e}-payment-method-change`},type:Ie,noMoreRetriesModal:!0}],[pi]:[{buttonText:`${e}-refused-location-button-text`,description:`${e}-refused-location-description-text`,errorCodes:[{code:720}],headerText:`${e}-default-header-text`,imageSize:"24",linkText:`${e}-default-exit`,panelInfoHeadingTitle:"L",title:`${e}-refused-location-title`,buttonEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"location_source"}},linkEvent:{name:`${e}-user-close`}},{buttonText:`${e}-disabled-bluetooth-button-text`,description:`${e}-disabled-bluetooth-description`,errorCodes:[{code:702}],headerText:`${e}-default-header-text`,imageSize:"24",linkText:`${e}-disabled-bluetooth-link-text`,panelInfoHeadingTitle:"L",title:`${e}-disabled-bluetooth-title`,type:Pe,buttonEvent:{name:`${e}-retry-scan-devices-call`},linkEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"bluetooth"}}},{analyticsEvent:ci.bluetoothError,buttonText:`${e}-refused-bluetooth-button-text`,description:`${e}-refused-bluetooth-description-text`,errorCodes:[{code:702}],headerText:`${e}-default-header-text`,imageSize:"24",panelInfoHeadingTitle:"L",title:`${e}-refused-bluetooth-title`,type:Ae,noMoreRetriesModal:!0,buttonEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"application_settings"}},linkEvent:{name:`${e}-user-close`}},{analyticsEvent:ci.bluetoothError,buttonText:`${e}-refused-bluetooth-button-text`,description:`${e}-refused-bluetooth-description-text`,errorCodes:[{code:721}],headerText:`${e}-default-header-text`,imageSize:"24",panelInfoHeadingTitle:"L",title:`${e}-refused-bluetooth-title`,type:Ae,buttonEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"application_settings"}},linkEvent:{name:`${e}-user-close`}}],[mi]:[{buttonText:`${e}-disabled-bluetooth-button-text`,description:`${e}-disabled-bluetooth-description`,errorCodes:[{code:702}],headerText:`${e}-default-header-text`,imageSize:"24",linkText:`${e}-disabled-bluetooth-link-text`,panelInfoHeadingTitle:"L",title:`${e}-disabled-bluetooth-title`,type:Pe,buttonEvent:{name:`${e}-retry-connect-to-bluetooth-device-call`,shouldShowSpinner:!0},linkEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"bluetooth"}}},{analyticsEvent:ci.bluetoothError,buttonText:`${e}-refused-bluetooth-button-text`,description:`${e}-refused-bluetooth-description-text`,errorCodes:[{code:702}],headerText:`${e}-default-header-text`,imageSize:"24",panelInfoHeadingTitle:"L",title:`${e}-refused-bluetooth-title`,type:Ae,noMoreRetriesModal:!0,buttonEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"application_settings"}},linkEvent:{name:`${e}-user-close`}},{buttonText:`${e}-default-retry`,description:`${e}-no-binded-reader-description-text`,errorCodes:[{code:5200}],fullHeight:!0,headerText:`${e}-default-header-text`,linkText:`${e}-no-binded-reader-link-text`,title:`${e}-no-binded-reader-title`,buttonEvent:{name:`${e}-retry-connect-to-bluetooth-device-call`,shouldShowSpinner:!0},linkEvent:{name:`${e}-new-devices-scan`,shouldShowSpinner:!0}},{buttonText:`${e}-refused-location-button-text`,description:`${e}-refused-location-description-text`,errorCodes:[{code:720}],headerText:`${e}-default-header-text`,linkText:`${e}-default-exit`,imageSize:"24",panelInfoHeadingTitle:"L",title:`${e}-refused-location-title`,type:Le,buttonEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"location_source"}},linkEvent:{name:`${e}-user-close`}},{analyticsEvent:ci.executeChargeError,buttonText:`${e}-limit-exceeded-button-text`,description:`${e}-limit-exceeded-description`,errorCodes:[{code:1012}],fullHeight:!0,headerText:`${e}-limit-exceeded-header-text`,microillustration:"caution",title:`${e}-limit-exceeded-title`,type:Re,buttonEvent:{name:`${Fe}-call-action-open`}},{analyticsEvent:ci.executeChargeNoReadedCardError,buttonText:`${e}-execute-charge-no-readed-card-retry`,description:`${e}-execute-charge-no-readed-card-description-text`,errorCodes:[{code:6}],fullHeight:!0,headerText:`${e}-default-header-text`,title:`${e}-execute-charge-no-readed-card-title`,type:Le,buttonEvent:{name:`${e}-retry-${Le}-call`,shouldShowSpinner:!0},linkEvent:{name:`${e}-user-close`}},{analyticsEvent:ci.executeChargeError,errorCodes:[{code:6}],headerText:`${e}-default-header-text`,type:Le,noMoreRetriesModal:!0,genericErrorMethod:"_openModalSdkNotControlledError"},{buttonText:`${e}-cancelled-charge-retry`,description:`${e}-execute-charge-cancelled-charge-description-text`,errorCodes:[{code:99}],headerText:`${e}-default-header-text`,imageSize:"24",panelInfoHeadingTitle:"L",title:`${e}-execute-charge-cancelled-charge-title`,type:Me,buttonEvent:{name:`${e}-retry-${Me}-call`,shouldShowSpinner:!0}},{analyticsEvent:ci.executeChargeError,errorCodes:[{code:99}],headerText:`${e}-default-header-text`,type:Me,noMoreRetriesModal:!0,genericErrorMethod:"_openModalSdkNotControlledError"},{analyticsEvent:ci.executeChargeNoValidCardError,buttonText:`${e}-default-retry`,description:`${e}-execute-charge-no-valid-card-description-text`,errorCodes:[{code:2004},{code:2005},{code:2011},{code:3001},{code:3002},{code:3004},{code:3005},{code:3009},{code:3010},{code:3011}],fullHeight:!0,headerText:`${e}-default-header-text`,title:`${e}-execute-charge-no-valid-card-title`,type:Le,buttonEvent:{name:`${e}-retry-${Le}-call`,shouldShowSpinner:!0},linkEvent:{name:`${e}-user-close`}},{analyticsEvent:ci.executeChargeError,errorCodes:[{code:2004},{code:2005},{code:2011},{code:3001},{code:3002},{code:3004},{code:3005},{code:3009},{code:3010},{code:3011}],headerText:`${e}-default-header-text`,type:Le,noMoreRetriesModal:!0,genericErrorMethod:"_openModalSdkNotControlledError"},{analyticsEvent:ci.executeChargeInsufficientBalanceError,buttonText:`${e}-default-retry`,description:`${e}-execute-charge-insufficient-balance-description-text`,errorCodes:[{code:3003}],fullHeight:!0,headerText:`${e}-default-header-text`,title:`${e}-execute-charge-insufficient-balance-title`,type:Le,buttonEvent:{name:`${e}-retry-${Le}-call`,shouldShowSpinner:!0},linkEvent:{name:`${e}-user-close`}},{analyticsEvent:ci.executeChargeError,errorCodes:[{code:3003}],headerText:`${e}-default-header-text`,type:Le,noMoreRetriesModal:!0,genericErrorMethod:"_openModalSdkNotControlledError"},{buttonText:`${e}-default-retry`,description:`${e}-execute-charge-operation-not-allowed-description-text`,errorCodes:[{code:1018},{code:1023},{code:3201},{code:3203},{code:3204},{code:3205}],fullHeight:!0,headerText:`${e}-default-header-text`,title:`${e}-execute-charge-operation-not-allowed-title`,type:Le,buttonEvent:{name:`${e}-retry-${Le}-call`,shouldShowSpinner:!0},linkEvent:{name:`${e}-user-close`}},{analyticsEvent:ci.executeChargeError,errorCodes:[{code:1018},{code:1023},{code:3201},{code:3203},{code:3204},{code:3205}],headerText:`${e}-default-header-text`,type:Le,noMoreRetriesModal:!0,genericErrorMethod:"_openModalSdkNotControlledError"}],[_i]:[{buttonText:`${e}-share-link-voucher-button-text`,description:`${e}-share-link-voucher-description-text`,errorCodes:[{code:-4008}],fullHeight:!0,microillustration:"caution",headerText:`${e}-share-link-voucher-header-text`,title:`${e}-share-link-voucher-title`,type:Ve,buttonEvent:{name:`${Fe}-call-action-open`}}],[gi]:[{buttonText:`${e}-disabled-bluetooth-button-text`,description:`${e}-disabled-bluetooth-description`,errorCodes:[{code:702}],headerText:`${e}-default-header-text`,imageSize:"24",linkText:`${e}-disabled-bluetooth-link-text`,panelInfoHeadingTitle:"L",title:`${e}-disabled-bluetooth-title`,type:Pe,buttonEvent:{name:`${e}-retry-connect-to-bluetooth-device-call`,shouldShowSpinner:!0},linkEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"bluetooth"}}},{analyticsEvent:ci.bluetoothError,buttonText:`${e}-refused-bluetooth-button-text`,description:`${e}-refused-bluetooth-description-text`,errorCodes:[{code:702}],headerText:`${e}-default-header-text`,imageSize:"24",panelInfoHeadingTitle:"L",title:`${e}-refused-bluetooth-title`,type:Ae,noMoreRetriesModal:!0,buttonEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"application_settings"}},linkEvent:{name:`${e}-user-close`}},{buttonText:`${e}-refused-location-button-text`,description:`${e}-refused-location-description-text`,errorCodes:[{code:720}],headerText:`${e}-default-header-text`,imageSize:"24",linkText:`${e}-default-exit`,panelInfoHeadingTitle:"L",title:`${e}-refused-location-title`,buttonEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"location_source"}},linkEvent:{name:`${e}-user-close`}},{buttonText:`${e}-default-retry`,description:`${e}-no-binded-reader-description-text`,errorCodes:[{code:5200}],fullHeight:!0,headerText:`${e}-default-header-text`,linkText:`${e}-no-binded-reader-link-text`,title:`${e}-no-binded-reader-title`,buttonEvent:{name:`${e}-retry-connect-to-bluetooth-device-call`,shouldShowSpinner:!0},linkEvent:{name:`${e}-refund-new-devices-scan`,shouldShowSpinner:!0}},{analyticsEvent:ci.refundUnavailableError,buttonText:`${e}-unavailable-refund-button-text`,description:`${e}-unavailable-refund-description`,errorCodes:[{code:3006}],fullHeight:!0,headerText:`${e}-unavailable-refund-header-text`,microillustration:"caution",title:`${e}-unavailable-refund-title`,type:Be,buttonEvent:{name:`${Fe}-call-action-open`}}],[bi]:[{analyticsEvent:ci.refundUnavailableError,buttonText:`${e}-unavailable-refund-button-text`,description:`${e}-unavailable-refund-description`,errorCodes:[{code:3006}],fullHeight:!0,headerText:`${e}-unavailable-refund-header-text`,microillustration:"caution",title:`${e}-unavailable-refund-title`,type:Be,buttonEvent:{name:`${Fe}-call-action-open`}}],[yi]:[{buttonText:`${e}-unavailable-top-refund-button-text`,description:`${e}-unavailable-top-refund-description`,errorCodes:[{code:9999}],fullHeight:!0,headerText:`${e}-unavailable-top-refund-header-text`,microillustration:"caution",title:`${e}-unavailable-top-refund-title`,type:Be,buttonEvent:{name:`${Fe}-call-action-open`}},{analyticsEvent:ci.refundUnavailableError,buttonText:`${e}-top-refund-error-button-text`,description:`${e}-top-refund-error-description`,errorCodes:[{code:4001},{code:4002}],fullHeight:!0,headerText:`${e}-top-refund-error-header-text`,title:`${e}-top-refund-error-title`,type:Be,buttonEvent:{name:`${Fe}-sdk-error-modals-user-close`}},{buttonText:`${e}-disabled-nfc-button-text`,description:`${e}-disabled-nfc-description`,errorCodes:[{code:97}],headerText:`${e}-default-header-text`,imageSize:"24",panelInfoHeadingTitle:"L",title:`${e}-disabled-nfc-title`,buttonEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"nfc_settings"}}}],[$i]:[{analyticsEvent:ci.initTopError,buttonText:`${e}-unavailable-top-button-text`,description:`${e}-unavailable-top-description`,errorCodes:[{code:881},{code:882}],fullHeight:!0,headerText:`${e}-unavailable-top-header-text`,microillustration:"caution",title:`${e}-unavailable-top-title`,type:Oe,buttonEvent:{name:`${Fe}-sdk-error-modals-user-close`}},{analyticsEvent:ci.initTopCommonError,buttonText:`${e}-common-top-init-button-text`,description:`${e}-common-top-init-description`,errorCodes:[{code:9999}],fullHeight:!0,headerText:`${e}-common-top-init-header`,microillustration:"error",title:`${e}-common-top-init-title`,type:Oe,buttonEvent:{name:`${Fe}-sdk-error-modals-common-top-init-error`}}],[ui]:[{analyticsEvent:ci.executeChargeTopLimitError,buttonText:`${e}-emv-limit-button-text`,description:`${e}-emv-limit-description`,errorCodes:[{code:899}],fullHeight:!0,headerText:`${e}-emv-limit-header`,microillustration:"caution",title:`${e}-emv-limit-title`,type:Re,buttonEvent:{name:`${e}-emv-limit-exceeded`}},{analyticsEvent:ci.executeChargeError,buttonText:`${e}-disabled-nfc-execute-charge-top-button-text`,description:`${e}-disabled-nfc-execute-charge-top-description-text`,errorCodes:[{code:97}],imageSize:"24",panelInfoHeadingTitle:"L",headerText:`${e}-default-header-text`,microillustration:"error",title:`${e}-disabled-nfc-execute-charge-top-title`,type:Le,buttonEvent:{name:`${Fe}-phone-settings-open`,detail:{setting:"nfc_settings"}}},{analyticsEvent:ci.executeChargeError,buttonText:`${e}-limit-exceeded-button-text`,description:`${e}-limit-exceeded-description`,errorCodes:[{code:1012}],fullHeight:!0,headerText:`${e}-limit-exceeded-header-text`,microillustration:"caution",title:`${e}-limit-exceeded-title`,type:Re,buttonEvent:{name:`${Fe}-call-action-open`}},{analyticsEvent:ci.executeChargeNoReadedCardError,buttonText:`${e}-execute-charge-no-readed-card-retry`,description:`${e}-execute-charge-no-readed-card-description-text`,errorCodes:[{code:6}],fullHeight:!0,headerText:`${e}-default-header-text`,title:`${e}-execute-charge-no-readed-card-title`,type:Le,buttonEvent:{name:`${e}-retry-${Le}-call`,shouldShowSpinner:!0},linkEvent:{name:`${e}-user-close`}},{analyticsEvent:ci.executeChargeError,errorCodes:[{code:6}],headerText:`${e}-default-header-text`,type:Le,noMoreRetriesModal:!0,genericErrorMethod:"_openModalSdkNotControlledError"},{buttonText:`${e}-cancelled-charge-retry`,description:`${e}-execute-charge-cancelled-charge-description-text`,errorCodes:[{code:99}],headerText:`${e}-default-header-text`,imageSize:"24",panelInfoHeadingTitle:"L",title:`${e}-execute-charge-cancelled-charge-title`,type:Me,buttonEvent:{name:`${e}-retry-${Me}-call`,shouldShowSpinner:!0}},{analyticsEvent:ci.executeChargeError,errorCodes:[{code:99}],headerText:`${e}-default-header-text`,type:Me,noMoreRetriesModal:!0,genericErrorMethod:"_openModalSdkNotControlledError"},{analyticsEvent:ci.executeChargeNoValidCardError,buttonText:`${e}-default-retry`,description:`${e}-execute-charge-no-valid-card-description-text`,errorCodes:[{code:2004},{code:2005},{code:2011},{code:3001},{code:3002},{code:3004},{code:3005},{code:3009},{code:3010},{code:3011}],fullHeight:!0,headerText:`${e}-default-header-text`,title:`${e}-execute-charge-no-valid-card-title`,type:Le,buttonEvent:{name:`${e}-retry-${Le}-call`,shouldShowSpinner:!0},linkEvent:{name:`${e}-user-close`}},{analyticsEvent:ci.executeChargeError,errorCodes:[{code:2004},{code:2005},{code:2011},{code:3001},{code:3002},{code:3004},{code:3005},{code:3009},{code:3010},{code:3011}],headerText:`${e}-default-header-text`,type:Le,noMoreRetriesModal:!0,genericErrorMethod:"_openModalSdkNotControlledError"},{analyticsEvent:ci.executeChargeInsufficientBalanceError,buttonText:`${e}-default-retry`,description:`${e}-execute-charge-insufficient-balance-description-text`,errorCodes:[{code:3003}],fullHeight:!0,headerText:`${e}-default-header-text`,title:`${e}-execute-charge-insufficient-balance-title`,type:Le,buttonEvent:{name:`${e}-retry-${Le}-call`,shouldShowSpinner:!0},linkEvent:{name:`${e}-user-close`}},{analyticsEvent:ci.executeChargeError,errorCodes:[{code:3003}],headerText:`${e}-default-header-text`,type:Le,noMoreRetriesModal:!0,genericErrorMethod:"_openModalSdkNotControlledError"},{buttonText:`${e}-default-retry`,description:`${e}-execute-charge-operation-not-allowed-description-text`,errorCodes:[{code:1018},{code:1023},{code:3201},{code:3203},{code:3204},{code:3205}],fullHeight:!0,headerText:`${e}-default-header-text`,title:`${e}-execute-charge-operation-not-allowed-title`,type:Le,buttonEvent:{name:`${e}-retry-${Le}-call`,shouldShowSpinner:!0},linkEvent:{name:`${e}-user-close`}},{analyticsEvent:ci.executeChargeError,errorCodes:[{code:1018},{code:1023},{code:3201},{code:3203},{code:3204},{code:3205}],headerText:`${e}-default-header-text`,type:Le,noMoreRetriesModal:!0,genericErrorMethod:"_openModalSdkNotControlledError"}]}[t]),Ui={PAYMENT_LINK:"LINK_COBRO",TAP_ON_PHONE:"TAP_ON_PHONE",MPOS:"CARD_PRESENT"},qi=t=>{const{status:e,refunds:i=[],authorization:a}=t;return{completed:Di(i)?ji(a,i):"completed",failed:"failed",error:"failed"}[e.toLowerCase()]||""},ji=(t,e)=>t===e[0].authorization?"cancelled":"refund",Wi=t=>{const{amount:e,refunds:i=[],authorization:a}=t;return Di(i)&&"refund"===ji(a,i)?-e:e},Ji=t=>t.map(Gi),Gi=t=>{var e,i,a,s,o,n,r,l,d;return{amount:Wi(t),currency:t.currency,authorization:t.authorization,card:{type:null===(e=t.card)||void 0===e?void 0:e.type,brand:null===(i=t.card)||void 0===i?void 0:i.brand,card_number:null===(a=t.card)||void 0===a?void 0:a.cardNumber,bank_name:null===(s=t.card)||void 0===s?void 0:s.bankName,bank_code:null===(o=t.card)||void 0===o?void 0:o.bankCode},creationDate:t.creationDate,customer:t.customer&&{name:null===(n=t.customer)||void 0===n?void 0:n.name,email:null===(r=t.customer)||void 0===r?void 0:r.email},description:t.description,fee:{amount:null===(l=t.fee)||void 0===l?void 0:l.amount},id:t.id,operationDate:t.date,orderId:t.orderId,status:qi(t),gatewayCardPresent:t.gatewayCardPresent,operationType:ti,payment_method_name:Ui[t.productType]??t.productType,readMode:t.readMode,paymentPlan:null===(d=t.paymentPlan)||void 0===d?void 0:d.payments}},Xi=t=>{var e,i,a,s,o,n,r,l,d,c,h,p,m,u,v;return{amount:t.amount,checkoutLink:t.checkoutLink,creationDate:t.creationDate,currency:t.currency,customer:{name:null===(e=t.customer)||void 0===e?void 0:e.name,email:null===(i=t.customer)||void 0===i?void 0:i.email,lastName:null===(a=t.customer)||void 0===a?void 0:a.lastName,phoneNumber:null===(s=t.customer)||void 0===s?void 0:s.phoneNumber,externalId:null===(o=t.customer)||void 0===o?void 0:o.externalId},description:t.description,expirationDate:t.expirationDate,id:t.id,iva:t.iva,operationDate:null===(n=t.transaction)||void 0===n?void 0:n.creationDate,operationType:ei,orderId:t.orderId,status:t.status.toLowerCase(),transaction:{amount:null===(r=t.transaction)||void 0===r?void 0:r.amount,authorization:null===(l=t.transaction)||void 0===l?void 0:l.authorization,description:null===(d=t.transaction)||void 0===d?void 0:d.description,errorMessage:null===(c=t.transaction)||void 0===c?void 0:c.errorMessage,id:null===(h=t.transaction)||void 0===h?void 0:h.id,iva:null===(p=t.transaction)||void 0===p?void 0:p.iva,method:null===(m=t.transaction)||void 0===m?void 0:m.method,orderID:null===(u=t.transaction)||void 0===u?void 0:u.orderID,status:null===(v=t.transaction)||void 0===v?void 0:v.status}}},Yi=t=>t.map(Xi),Ki=t=>{var e;return{authorization:t.authorization,bankCode:t.bankCode,bankName:t.bankName,bin:t.bin,brand:t.brand,cardNumber:t.cardNumber,gatewayCardPresent:t.gatewayCardPresent,id:t.id,readMode:t.readMode,span:t.span,operationDate:t.date,status:Ge,type:t.type,operationType:ti,paymentPlan:null===(e=t.paymentPlan)||void 0===e?void 0:e.payments}},Zi=t((t=>class extends(_e(t)){setOnLocalStorage(t,e,i=!1,a=!0){this._dispatchEvent(`${Fe}-local-storage-set`,{key:t,value:e,volatile:i,secure:a})}getFromLocalStorage(t,e=!1,i=!0){this._dispatchEvent(`${Fe}-local-storage-get`,{key:t,volatile:e,secure:i})}})),Qi=t=>class extends(Zi(t)){setMerchants(t,e=!0){const i=this._getMerchantsStoreMixinInstance();i._setMerchants(t),i._getMerchants().length&&e&&this._recordOnLocalStorage(i,i._getMerchants())}getMerchants(){return this._getMerchantsStoreMixinInstance()._getMerchants()}setMerchantJws(t,e){this._getMerchantsStoreMixinInstance()._setMerchantJws(t,e)}getMerchantJws(){return this._getMerchantsStoreMixinInstance()._getMerchantJws()}setSelectedMerchant(t){this._getMerchantsStoreMixinInstance()._setSelectedMerchant(t)}getSelectedMerchant(){return this._getMerchantsStoreMixinInstance()._getSelectedMerchant()}getDefaultMerchantExists(){return this._getMerchantsStoreMixinInstance()._getMerchants().some((t=>t.isDefault))}setCardReaderDevice(t){this.getSelectedMerchant().cardReaderDevice=t}setUserSettings(t){this._getMerchantsStoreMixinInstance()._setUserSettings(t)}getUserSettings(){return this._getMerchantsStoreMixinInstance()._getUserSettings()}setMerchantsTtl(t){this._getMerchantsStoreMixinInstance()._setMerchantsTtl(t)}setPropertyToStore(t,e,i=!0){const a=this._getMerchantsStoreMixinInstance();a[t]=e,i&&this._recordOnLocalStorage(a,a._getMerchants())}getPropertyFromStore(t){return this._getMerchantsStoreMixinInstance()[t]}_getMerchantsStoreMixinInstance(){return ta.instance||ta._createInstance(),ta.instance}_recordOnLocalStorage(t,e){const i=e.map((t=>{const{isSelected:e,jws:i,ttl:a,...s}=t;return s})),{isOnboardingDone:a,unavailableTop:s}=t;this.setOnLocalStorage(li,{isOpenPayUser:!!i.length,ttl:t._getMerchantsTtl(),merchants:i,...a&&{isOnboardingDone:a},...s&&{unavailableTop:s}})}};class ta{constructor(){return ta.instance||(this.merchants=[],this.userSettings=[],this.merchantsTtl="",this.isOnboardingDone=!1,ta.instance=this),ta.instance}static _createInstance(){return new this}_setMerchants(t){this.merchants=[...t]}_getMerchants(){return this.merchants}_setMerchantsTtl(t){this.merchantsTtl=t}_getMerchantsTtl(){return this.merchantsTtl}_setSelectedMerchant(t){const e=this.merchants.find((e=>e.id===t));e.isSelected=!!e,this.merchants.forEach((e=>{e.id!==t&&(e.isSelected=!1)}))}_getSelectedMerchant(){return this.merchants.find((t=>t.isSelected))||this.merchants.find((t=>t.isDefault))||this.merchants[0]||{}}_setMerchantJws(t,e){const i=this._getSelectedMerchant(),a=this.merchants.map((a=>a.id===i.id?{...a,jws:t,ttl:e}:{...a}));this._setMerchants(a)}_getMerchantJws(){return this._getSelectedMerchant().jws}_setUserSettings(t){this.userSettings=[...t]}_getUserSettings(){return this.userSettings}}const ea=t((t=>class extends(Qi(t)){ttlGuard(t){return e=>{if(this._isTTLAvailable()){const i=this.getMerchantJws();return t.bind(this)({...e,jws:i})}this._dispatchEvent(`${Fe}-merchant-ttl-jws-expired`)}}ttlGuardCallSSO(t,e){return i=>this._isTTLAvailable()?e.call(this):t.bind(this)({...i})}_isTTLAvailable(){var t;return(null===(t=this.getSelectedMerchant())||void 0===t?void 0:t.ttl)&&!Ii(this.getSelectedMerchant().ttl)}})),ia={set:(t,e,i)=>(t[e]=i,t.update(),!0)};class aa{update(){this._observers.forEach((t=>{t.requestUpdate()}))}subscribe(t){this._observers.push(t)}constructor(){return aa.instance||(this.callBack=null,this.devicesList=[],this.device={},this.requester={},this.transactionDetail={},this.isDeviceConnected=!1,this.shouldCallInitTop=!1,this._observers=[],aa.instance=this),aa.instance}setCallBack(t,e){this.callBack=t.bind(this,e)}setDevices(t){this.devicesList=t}setShouldCallInitTop(t){this.shouldCallInitTop=t}setDevice(t){this.device={...t}}setRequester(t){this.requester=t}setTransactionDetail(t){this.transactionDetail={...t}}setIsDeviceConnected(t){this.isDeviceConnected=t}getCallBack(){return this.callBack}getDevices(){return this.devicesList||[]}getDevice(){return this.device||{}}getTransactionDetail(){return this.transactionDetail}getIsDeviceConnected(){return this.isDeviceConnected}getShouldCallInitTop(){return this.shouldCallInitTop}static _createInstance(){return new this}}const sa=t((t=>class extends(tt(_e(Qi(ea(t))))){static get properties(){return{executedChargeData:{type:Object},devicesList:{type:Array},hasMoreElements:{type:Boolean},hostOpenPay:{type:String,attribute:"host-open-pay"},linksList:{type:Array,attribute:"links-list"},operationsList:{type:Array},generatedPaymentLink:{type:Object,attribute:"generated-payment-link"},pageSize:{type:Number,attribute:"page-size"},shouldCallInitTop:{type:Boolean,attribute:"should-call-init-top"},_resolver:{type:Object}}}constructor(){super(),this.executedChargeData={},this.applyTransactionRefund=this.ttlGuard(this.applyTransactionRefund),this.callSdkByOperationId=this.ttlGuard(this.callSdkByOperationId),this.listTransactions=this.ttlGuard(this.listTransactions),this.paymentLinkListing=this.ttlGuard(this.paymentLinkListing),this.cancelPaymentLink=this.ttlGuard(this.cancelPaymentLink),this.connectToBluetoothDevice=this.ttlGuard(this.connectToBluetoothDevice),this.defaultDevice={},this.devicesList=[],this.executeCharge=this.ttlGuard(this.executeCharge),this.executeChargeTop=this.ttlGuard(this.executeChargeTop),this.createPaymentLink=this.ttlGuard(this.createPaymentLink),this.hasMoreElements=!1,this.linksList=[],this.operationsList=[],this.generatedPaymentLink={},this.pageSize=10,this.sendVoucher=this.ttlGuard(this.sendVoucher),this.shouldCallInitTop=!1,this.updatePaymentLink=this.ttlGuard(this.updatePaymentLink),this.callInitTop=this.ttlGuard(this.callInitTop),this._resolver=new Proxy(this.constructor._getSdkHandlerInstance(),ia),this._resolver.subscribe(this)}setIsDeviceConnected(t){this._resolver.setIsDeviceConnected(t)}setShouldCallInitTop(t){this._resolver.setShouldCallInitTop(t)}getShouldCallInitTop(){return this._resolver.getShouldCallInitTop()}applyTransactionRefund({transactionData:t,singleUseJws:e,jws:i}){const{id:a,orderId:s,amount:o,totalPrice:n,readMode:r,gatewayCardPresent:l,cardNumber:d,card:c}=t,h={secureRefundTerminal:e,secureTerminal:i,transaction:{id:a,orderId:s,amount:Number(o)||Number(n),readMode:r,gatewayCardPresent:l,card:{cardNumber:d??c.card_number}}};this._dispatchEvent(`${Fe}-transaction-refund-apply`,h),this.clearLoader()}applyLinkRefund({transactionData:t,singleUseJws:e}){this.showLoader(oi);const{id:i,transaction:a}=t,s={secureTerminal:e,transactionId:(null==a?void 0:a.id)??i};this._dispatchEvent(`${Fe}-link-refund-apply`,s)}applyTopRefund({transactionData:t,singleUseJws:e,jws:i}){this.showLoader(oi);const{id:a,orderId:s,amount:o,totalPrice:n,readMode:r,gatewayCardPresent:l,cardNumber:d,card:c}=t;if(this._resolver.setCallBack(this.applyTopRefund,{transactionData:t,singleUseJws:e,jws:i}),this._resolver.getShouldCallInitTop())return void this.callInitTop();const h={secureRefundTerminal:e,secureTerminal:i,transaction:{id:a,orderId:s,amount:Number(o)||Number(n),readMode:r,gatewayCardPresent:l,card:{cardNumber:d??c.card_number}}};this._dispatchEvent(`${Fe}-top-refund-apply`,h)}callInitSdk(){this._dispatchEvent(`${Fe}-sdk-init`,{environment:this.hostOpenPay})}listTransactions(t,e=this){const{jws:i}=t,a={secureTerminal:i,transactionFilter:{...t,status:["completed","failed","cancelled"]}};this._resolver.setRequester(e),this.hasMoreElements=!0,this._dispatchEvent(`${Fe}-transactions-list-get`,a)}resolveCallSdkOperations(t){const e=Ji(t);this.requester.hasMoreElements=e.length>=this.pageSize,this.requester.operationsList=[...this.requester.operationsList,...e],this.dashboardTransactionsListFailed=!1,this._isTransactionsListCallFiltered=!1,this.clearLoader()}paymentLinkListing({offset:t,limit:e,operationGte:i,operationLte:a,origin:s=this,status:o,jws:n}){0===t&&this.showLoader(oi),this._resolver.setRequester(s),this.hasMoreElements=!0;const r={secureTerminal:n,paymentLinkFilter:{offset:t,limit:e,startDate:i,endDate:a,status:o?o.map((t=>t.toLowerCase())):o}};this._dispatchEvent(`${Fe}-links-list-get`,r)}resolveCallSdkPaymentLinks(t){this.requester.hasMoreElements=t.length>=this.pageSize,this.requester.linksList=[...this.requester.linksList,...Yi(t)],this.clearLoader()}callSdkByOperationId(t,e=this){const{operationId:i,jws:a}=t,s={secureTerminal:a,transactionFilter:{transactionId:i}};this._resolver.setRequester(e),this.hasMoreElements=!0,this._dispatchEvent(`${Fe}-transaction-by-id-get`,s)}resolveCallSdkOperationById(t){const e=Ji(t);this.requester.hasMoreElements=!1,this.requester.operationsList=e}connectToBluetoothDevice({device:t=this.device,jws:e},i=this){const a={secureTerminal:e,deviceDTO:t};this.isDeviceConnected?this._dispatchEvent(`${Fe}-bluetooth-connection-success`,this.device):(this._resolver.setRequester(i),this._resolver.setDevice(t),this._dispatchEvent(`${Fe}-device-connect`,a))}executeCharge(t){const{ivaAmount:e,orderId:i,jws:a,products:s,totalPrice:o}=t,n=Oi(s),r={secureTerminal:a,orderTerminal:{amount:Number(o),orderId:i,description:n,iva:String(e),currency:this.currencyCode}};this._dispatchEvent(`${Fe}-charge-execute`,r),this.clearLoader()}executeChargeTop(t){const{ivaAmount:e,orderId:i,jws:a,products:s,totalPrice:o}=t;if(this._resolver.setCallBack(this.executeChargeTop,t),this._resolver.getShouldCallInitTop())return void this.callInitTop();const n=Oi(s),r={secureTerminal:a,orderTerminal:{amount:Number(o),orderId:i,description:n,iva:String(e),currency:this.currencyCode}};this._dispatchEvent(`${Fe}-top-charge-execute`,r),this.showLoader(oi)}createPaymentLink(t,e=this){this.showLoader(oi);const{expirationDays:i,ivaAmount:a,customer:{email:s,name:o},jws:n,redirectUrl:r,totalPrice:l}=t;this._resolver.setRequester(e);const d=Oi(t.products),c=(h=i,Mi().add(h,"days").format(Se));var h;const p={secureTerminal:n,paymentLink:{orderId:Bi(),amount:Number(l),description:d,iva:a.toFixed(2),expirationDate:c,redirectURL:r,sendEmail:!0,customer:{name:o,email:s}}};this._dispatchEvent(`${Fe}-payment-link-create`,p)}getDevices(){return this._resolver.getDevices()}get device(){return this._resolver.getDevice()}get requester(){return this._resolver.requester}get transactionDetail(){return this._resolver.getTransactionDetail()}get isDeviceConnected(){return this._resolver.getIsDeviceConnected()}cancelPaymentLink(t){this.showLoader(oi);const{expirationDate:e,jws:i,linkId:a,status:s}=t,o={secureTerminal:i,linkData:{id:a,status:s,expirationDate:Vi(e),sendEmail:!1}};this._dispatchEvent(`${Fe}-link-cancel`,o)}resolveApplyLinkRefund(t){this._dispatchEvent(`${Fe}-apply-refund-success`,Gi(t)),this.clearLoader()}resolveApplyTransactionRefund(t){this._dispatchEvent(`${Fe}-apply-refund-success`,Gi(t)),this.clearLoader()}resolveApplyTopRefund(t){this._dispatchEvent(`${Fe}-apply-refund-success`,Gi(t)),this.clearLoader()}resolveCallInitSdk(){this._dispatchEvent(`${Fe}-sdk-init-success`)}resolveCallInitTop(){this._resolver.getShouldCallInitTop()&&(this.setShouldCallInitTop(!1),this._resolver.getCallBack()()),this._dispatchEvent(`${Fe}-top-init-success`)}resolveCancelPaymentLink(t){const e=Xi(t);this.requester.generatedPaymentLink=e,this._resolver.setTransactionDetail(e),this._dispatchEvent(`${Fe}-cancel-link-success`),this.clearLoader()}resolveConnectedDevice(t){const{isConnected:e,code:i,success:a}=t,s=e||a||"200"===i;this.setIsDeviceConnected(s),s?(this.setCardReaderDevice(this.device),this._dispatchEvent(`${Fe}-bluetooth-connection-success`,this.device)):this.connectToBluetoothDevice({device:this.device})}resolveExecuteCharge(t){this.executedChargeData={...Ki(t)}}resolveExecuteTopCharge(t){this.executedChargeData={...Ki(t)},this.clearLoader()}resolveGeneratePaymentLink(t){const e=Xi(t);this.requester.generatedPaymentLink=e,this._dispatchEvent(`${Fe}-link-generate-success`),this.clearLoader()}resolveScannedDevices(t){this._resolver.setDevices(t),this.clearLoader()}resolveSendVoucher(){this._dispatchEvent(`${Fe}-share-voucher-success`),this.clearLoader()}resolveUpdatePaymentLink(t){this.transactionDetail=Xi(t),this.requester._dispatchEvent(`${Fe}-edit-link-date-success`),this.clearLoader()}set transactionDetail(t){this._resolver.setTransactionDetail(t)}sendVoucher({email:t,id:e,jws:i}){this.showLoader(oi),this._dispatchEvent(`${Fe}-voucher-share`,{secureTerminal:i,sendVoucherRequestDTO:{email:t,idTransaction:e}})}scanNewDevices(){this.showLoader(si),this._dispatchEvent(`${Fe}-new-devices-scan`)}updatePaymentLink({jws:t,newLinkData:e,origin:i}){this.showLoader(oi),this._resolver.setRequester(i);const{expirationDate:a,linkId:s,status:o}=e,n={secureTerminal:t,linkData:{id:s,status:o,expirationDate:Vi(a),sendEmail:!1}};this._dispatchEvent(`${Fe}-link-date-edit`,n)}callInitTop({jws:t}){this._dispatchEvent(`${Fe}-top-init`,{secureTerminal:t})}static _getSdkHandlerInstance(){return aa.instance||aa._createInstance(),aa.instance}}));class oa{constructor(){return oa.instance||(this.openViews=[],oa.instance=this),oa.instance}static _createInstance(){return new this}addView(t){this.openViews.find((e=>e.constructor.is===t.constructor.is))||this.openViews.unshift(t)}closeView(t){const e=this.openViews.indexOf(t);e>-1&&this.openViews.splice(e,1)}_currentView(){return this.openViews.slice(-1)}}const na=t((t=>class extends(_e(t)){addView(t){this._getNavigationMixinInstance().addView(t)}closeView(t){this._getNavigationMixinInstance().closeView(t)}currentView(){return this._getNavigationMixinInstance()._currentView()}navigateBackTo(t){const e=this._getNavigationMixinInstance(),i=`${Fe}-${t}`,a=e.openViews.findIndex((t=>t.constructor.is===i));e.openViews.forEach(((t,e)=>{t.constructor.is!==i&&e<a&&(t._dispatchEvent(`${t.constructor.is}-close`),t.visible=!1)})),e.openViews=e.openViews.slice(a)}clearNavigationStack(){const t=this._getNavigationMixinInstance();t.openViews.forEach((t=>{t._dispatchEvent(`${t.constructor.is}-close`),t.visible=!1})),t.openViews=[]}navigateBack(){const t=this._getNavigationMixinInstance(),e=t.openViews[0],i=`${Fe}-dashboard`;e._navigateBack?e._navigateBack():1===t.openViews.length?e.constructor.is===i?this._dispatchEvent(`${Fe}-leave`):e.visible=!1:e.constructor.is.includes("receipt")?(this.navigateBackTo(t.openViews[t.openViews.length-1].constructor.is.split(`${Fe}-`)[1]),t.openViews[t.openViews.length-1].constructor.is!==i&&this.navigateBack()):this.navigateBackTo(t.openViews[1].constructor.is.split(`${Fe}-`)[1])}_getNavigationMixinInstance(){return oa.instance||oa._createInstance(),oa.instance}})),ra=t((t=>class extends(_e(tt(sa(Qi(t))))){static get properties(){return{dashboardTransactionsListFailed:{type:Boolean,attribute:"dashboard-transactions-list-failed",reflect:!0},isInitializingTopTransaction:{type:Boolean,attribute:"is-initializing-top-transaction"},isNotTopBlockingError:{type:Boolean,attribute:"is-not-top-blocking-error"},sdkErrorResponse:{type:Object,attribute:"sdk-error-response"},_retryErrorCount:{type:Number}}}constructor(){super(),this.dashboardTransactionsListFailed=!1,this.isInitializingTopTransaction=!1,this.isNotTopBlockingError=!1,this.sdkErrorResponse={},this._retryErrorCount=0}openCallAction(){this._dispatchEvent(`${Fe}-call-action-open`)}_openModalSdkNotControlledError(t="default"){"default"===t&&this._type===Le&&this.navigateBack(),this._retryErrorCount=0,this.clearLoader(),this._dispatchEvent(`${Fe}-sdk-not-controlled-error-display`,Ni[t])}resolveApplyTransactionRefundError(t){this.sdkErrorResponse={...t,operationType:gi},this.setIsDeviceConnected(5200!==this.sdkErrorResponse.code)}resolveApplyLinkRefundError(t){this.sdkErrorResponse={...t,operationType:bi}}resolveApplyTopRefundError(t){t.code?this.sdkErrorResponse={...t,operationType:yi}:this._openModalSdkNotControlledError("operationError")}resolveExecuteChargeError(t){this.sdkErrorResponse={...t,analyticsEvent:ci.executeChargeError,operationType:mi},this.setIsDeviceConnected(5200!==this.sdkErrorResponse.code)}resolveExecuteTopChargeError(t){const{code:e}=t;if(872===e)return this.setShouldCallInitTop(!0),void this.callInitTop();this.sdkErrorResponse={...t,operationType:ui}}resolveConnectedDeviceError(t){this.sdkErrorResponse={...t,analyticsEvent:ci.bluetoothError,operationType:vi},this.setIsDeviceConnected(!1)}resolveScanDevicesError(t){const{code:e}=t;105!==e?this.sdkErrorResponse={...t,operationType:pi}:this.resolveScannedDevices([])}resolveSdkInitError(){this._dispatchEvent(`${Fe}-custom-sdk-common-error-display`,Ni.commonErrorUnavailableInformation)}resolveSdkOperativeError(){this._openModalSdkNotControlledError("unfinishOperative")}resolveSdkAvailableError(){this._openModalSdkNotControlledError("unavailableInformation")}resolveSdkListTransactionsError(){this._isTransactionsListCallFiltered?(this._openModalSdkNotControlledError("unavailableInformation"),this._isTransactionsListCallFiltered=!1):this.dashboardTransactionsListFailed=!0}resolveInitTopError(t){const{code:e}=t;this.isNotTopBlockingError=!(881===e||882===e),(!this.isNotTopBlockingError&&!this.getPropertyFromStore("unavailableTop")||this.isInitializingTopTransaction)&&(this.sdkErrorResponse={...this.getPropertyFromStore("unavailableTop")||this.isNotTopBlockingError?{code:9999}:t,operationType:$i}),this.isNotTopBlockingError||this.setPropertyToStore("unavailableTop",!0)}handleCommonSdkErrorModalClose(){this.viewMode===Ze?(this.clearNavigationStack(),this.viewMode=Qe):this.navigateBack("dashboard")}})),la=t((t=>class extends(m(Qi(t))){static get properties(){return{taxTypes:{type:Array}}}constructor(){super(),this.taxTypes=[]}get selectedIva(){const{defaultIVAId:t}=this.getSelectedMerchant();return t||this.taxTypes[0]}getIvaText(t){return Number.isNaN(Number(t))?"NA"===t?"":this.t(`payments-mpos-overview-iva-type-${t.toLowerCase()}`):`${t}% ${this.t("payments-mpos-overview-iva-type-included")}`}})),da="operation",ca="amount",ha="paymentDate",pa="sendDate",ma="detailProcessedLink",ua="detailAvailableLink",va="detailExpiredLink",ga="detailCancelledLink",ba="detailProcessedTransaction",ya="detailCancelledTransaction",_a="detailRefundTransaction",$a={[We]:ma,[je]:ga,[Ue]:ua,[qe]:va,[Ye]:_a,[Je]:ya,[Ge]:ba,[Xe]:ya},fa=t((t=>class extends(m(_e(Qi(la(t))))){generateDataToReceipt({data:t}){const e={[ti]:this._mapperCardReaderReceipt.bind(this),[ei]:this._mapperLinkReceipt.bind(this)};return"LINK_COBRO"===(null==t?void 0:t.payment_method_name)?e[ei](t):e[t.operationType](t)}formattedProductsDetailFromReceipt(t,e){return t.flatMap((i=>[{label:`${i.description} ${t.length>1?`(${i.units})`:""}`,value:`${u(e,e)} ${i.unitPrice.toFixed(2)} ${t.length>1?`${this._getTranslation("unit")}`:""}`},{label:this.getIvaText(i.iva)}]))}_mapperLinkReceipt(t){const e={[ha]:this._getPaymentDateLink.bind(this),[pa]:this._getSendDateLink.bind(this)},i=t.status===We?ha:pa;return{operative:this._getOperative(t.status),fields:{[da]:this._getOperationLink(t),[ca]:this._getAmount(t),[i]:e[i](t)}}}_mapperCardReaderReceipt(t){return{operative:this._getOperative(t.status),fields:{[da]:this._getOperationCardReader(t),[ca]:this._getAmount(t),[ha]:this._getDatesCardReader(t)}}}_getOperative(t){return $a[t]}_getTranslation(t,e={}){return this.t(`payments-mpos-overview-receipt-share-${t}`,e)}_getOperationLink(t){var e,i,a,s;return{values:[{label:this._getTranslation("merchant"),value:null===(e=this.getSelectedMerchant())||void 0===e?void 0:e.name},{label:this._getTranslation("id"),value:null===(i=this.getSelectedMerchant())||void 0===i?void 0:i.id},{label:this._getTranslation("charge-method"),value:this._getTranslation("link")},{label:this._getTranslation("service-operator"),value:this._getTranslation("openpay")},{label:this._getTranslation("name"),value:null===(a=t.customer)||void 0===a?void 0:a.name},{label:this._getTranslation("email"),value:null===(s=t.customer)||void 0===s?void 0:s.email}]}}_getOperationCardReader(t){var e,i;const{card:a,paymentPlan:s,payment_method_name:o,paymentMethod:n}=t,r="PRESENT_CARD"===o||"PRESENT_CARD"===n||"CARD_PRESENT"===o||"CARD_PRESENT"===n;return{values:[{label:this._getTranslation("merchant"),value:null===(e=this.getSelectedMerchant())||void 0===e?void 0:e.name},{label:this._getTranslation("id"),value:null===(i=this.getSelectedMerchant())||void 0===i?void 0:i.id},{label:this._getTranslation("charge-method"),value:r?this._getTranslation("card-reader"):this._getTranslation("tap-on-phone")},...s?[{label:this._getTranslation("installment-payments"),value:this._getTranslation("months-with-no-interest",{months:s})}]:[],...r?[{label:this._getTranslation("charging-device"),value:t.cardReaderDeviceId}]:[],{label:this._getTranslation("service-operator"),value:this._getTranslation("openpay")},{label:this._getTranslation("issuer"),value:(null==a?void 0:a.bank_name)||t.bankName},{label:this._getTranslation("payment-method"),value:`${this._getTranslation("card")} ${(null==a?void 0:a.brand)||t.brand} ${this._getTranslation((null==a?void 0:a.type)||t.type)}`},{label:this._getTranslation("card-number"),value:v((null==a?void 0:a.card_number)||t.cardNumber,"•",!0,"4")},{label:this._getTranslation("auth-number"),value:t.authorization||t.authNumber}]}}_getAmount(t){var e;const i=t.productsDetail?null===(e=t.productsDetail)||void 0===e?void 0:e.map((t=>({...t}))):[],a=Number(t.amount||t.totalPrice).toFixed(2);return{values:[...i,{label:this._getTranslation("total-amount"),value:`${u(t.currency,t.currency)} ${a}`},this._getIVA(t)]}}_getIVA(t){var e,i;const a=Number(null!==(e=t.fee)&&void 0!==e&&e.amount?null===(i=t.fee)||void 0===i?void 0:i.amount:t.iva&&!t.ivaAmount?t.iva:t.ivaAmount),s=t.iva&&t.ivaAmount?t.iva:"INCLUDED";return Number.isNaN(a)?"":{label:this.getIvaText(s),value:`${u(t.currency,t.currency)} ${a.toFixed(2)}`}}_getDatesCardReader(t){return{values:[...this._getOperationDateBlock(t),...this._getOperationIdBlock(t)]}}_getExpirationDateBlock(t){return[{label:this._getTranslation("expiration-date"),value:Ei(t.expirationDate,this.language,ke)}]}_getPaymentDateLink(t){return{values:[...this._getSendDateBlock(t),...this._getOperationDateBlock(t),...this._getOperationIdBlock(t)]}}_getOperationDateBlock(t){return[{label:this._getTranslation("operation-date"),value:Ei(t.operationDate,this.language,ke)},{label:this._getTranslation("operation-time"),value:Ei(t.operationDate,this.language,Te)}]}_getOperationIdBlock(t){return[{label:this._getTranslation("operation-id"),value:t.id}]}_getSendDateBlock(t){return[{label:this._getTranslation("send-date"),value:Ei(t.creationDate,this.language,ke)},{label:this._getTranslation("send-time"),value:Ei(t.creationDate,this.language,Te)}]}_getSendDateLink(t){return{values:[...this._getSendDateBlock(t),...this._getExpirationDateBlock(t),...this._getOperationIdBlock(t)]}}_getTransactionLinkDateBlock(t){return{values:{[Ge]:[...this._getSendDateBlock(t),...this._getOperationDateBlock(t),...this._getOperationIdBlock(t)]}[t.status]??[...this._getSendDateBlock(t),...this._getOperationIdBlock(t)]}}})),ka=t((t=>class extends t{static get properties(){return{transactionId:{type:String,attribute:"transaction-id"},_isShareVoucherModalVisible:{type:Boolean},_shareVoucherType:{type:String}}}constructor(){super(),this.transactionId="",this._isShareVoucherModalVisible=!1,this._shareVoucherType=""}_handleShareVoucherModalVisibility(t,e){this.transactionId=e,this._shareVoucherType=t,this._isShareVoucherModalVisible=!0}})),wa=t((t=>class extends(m(Qi(t))){static get properties(){return{validPeriodTypes:{type:Array,attribute:"valid-period-types"}}}constructor(){super(),this.validPeriodTypes=[]}get expirationDays(){const{validPeriodPaymentLinkId:t}=this.getSelectedMerchant();return t||this.validPeriodTypes[0]||""}getValidPeriodLinkText(t){return 1===Number(t)?this.t("payments-mpos-overview-valid-period-link-day"):this.t("payments-mpos-overview-valid-period-link-days",{days:t})}}));var xa=g`
:host {
  --_button-tpv-pad-button-bg:
    var(--bbva-button-tpv-pad--_ambient--button-bg,
      var(--bbva-button-tpv-pad--custom--primary-ambient--button-bg,
        ${et("colorPrimarySurfaceAlternativeDefault",it)}));
  --_button-tpv-pad-button-pressed-bg:
    var(--bbva-button-tpv-pad--_ambient--button-pressed-bg,
      var(--bbva-button-tpv-pad--custom--primary-ambient--button-pressed-bg,
        ${et("colorPrimarySelectionInteraction01BackgroundSelected",it)}));
  --_button-tpv-pad-icon-color:
    var(--bbva-button-tpv-pad--_ambient--icon-color,
      var(--bbva-button-tpv-pad--custom--primary-ambient--icon-color,
        ${et("colorPrimaryText01Default",it)}));
  --_button-tpv-pad-icon-pressed-color:
    var(--bbva-button-tpv-pad--_ambient--icon-pressed-color,
      var(--bbva-button-tpv-pad--custom--primary-ambient--icon-pressed-color,
        ${et("colorPrimarySelectionInteraction01TextSelected",it)}));
  --_button-tpv-pad-text-color:
    var(--bbva-button-tpv-pad--_ambient--text-color,
      var(--bbva-button-tpv-pad--custom--primary-ambient--text-color,
        ${et("colorPrimaryText01Default",it)}));
  --_button-tpv-pad-text-pressed-color:
    var(--bbva-button-tpv-pad--_ambient--text-pressed-color,
      var(--bbva-button-tpv-pad--custom--primary-ambient--text-pressed-color,
        ${et("colorPrimarySelectionInteraction01TextSelected",it)}));
}
`;const Ta=g`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-button-tpv-pad--_ambient--button-bg: initial;
    --bbva-button-tpv-pad--_ambient--button-pressed-bg: initial;
    --bbva-button-tpv-pad--_ambient--icon-color: initial;
    --bbva-button-tpv-pad--_ambient--icon-pressed-color: initial;
    --bbva-button-tpv-pad--_ambient--text-color: initial;
    --bbva-button-tpv-pad--_ambient--text-pressed-color: initial;
  }
`,Sa=g`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-button-tpv-pad--_ambient--button-bg: var(
      --bbva-button-tpv-pad--custom--primary-alt-ambient--button-bg,
      ${et("colorPrimaryAltSurfaceAlternativeDefault",it)}
    );

    --bbva-button-tpv-pad--_ambient--button-pressed-bg: var(
      --bbva-button-tpv-pad--custom--primary-alt-ambient--button-pressed-bg,
      ${et("colorPrimarySelectionInteraction01BackgroundSelected",it)}
    );

    --bbva-button-tpv-pad--_ambient--icon-color: var(
      --bbva-button-tpv-pad--custom--primary-alt-ambient--icon-color,
      ${et("colorPrimaryAltText01Default",it)}
    );

    --bbva-button-tpv-pad--_ambient--icon-pressed-color: var(
      --bbva-button-tpv-pad--custom--primary-alt-ambient--icon-pressed-color,
      ${et("colorPrimaryAltSelectionInteraction01TextSelected",it)}
    );

    --bbva-button-tpv-pad--_ambient--text-color: var(
      --bbva-button-tpv-pad--custom--primary-alt-ambient--text-color,
      ${et("colorPrimaryAltText01Default",it)}
    );

    --bbva-button-tpv-pad--_ambient--text-pressed-color: var(
      --bbva-button-tpv-pad--custom--primary-alt-ambient--text-pressed-color,
      ${et("colorPrimaryAltSelectionInteraction01TextSelected",it)}
    );
  }
`,Ca=g`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-button-tpv-pad--_ambient--button-bg: var(
      --bbva-button-tpv-pad--custom--secondary-ambient--button-bg,
      ${et("colorSecondarySurfaceAlternativeDefault",it)}
    );

    --bbva-button-tpv-pad--_ambient--button-pressed-bg: var(
      --bbva-button-tpv-pad--custom--secondary-ambient--button-pressed-bg,
      ${et("colorSecondarySelectionInteraction01BackgroundSelected",it)}
    );

    --bbva-button-tpv-pad--_ambient--icon-color: var(
      --bbva-button-tpv-pad--custom--secondary-ambient--icon-color,
      ${et("colorSecondaryText01Default",it)}
    );

    --bbva-button-tpv-pad--_ambient--icon-pressed-color: var(
      --bbva-button-tpv-pad--custom--secondary-ambient--icon-pressed-color,
      ${et("colorSecondarySelectionInteraction01TextSelected",it)}
    );

    --bbva-button-tpv-pad--_ambient--text-color: var(
      --bbva-button-tpv-pad--custom--secondary-ambient--text-color,
      ${et("colorSecondaryText01Default",it)}
    );

    --bbva-button-tpv-pad--_ambient--text-pressed-color: var(
      --bbva-button-tpv-pad--custom--secondary-ambient--text-pressed-color,
      ${et("colorSecondarySelectionInteraction01TextSelected",it)}
    );
  }
`,Da=g`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-button-tpv-pad--_ambient--button-bg: var(
      --bbva-button-tpv-pad--custom--secondary-alt-ambient--button-bg,
      ${et("colorSecondaryAltSurfaceAlternativeDefault",it)}
    );

    --bbva-button-tpv-pad--_ambient--button-pressed-bg: var(
      --bbva-button-tpv-pad--custom--secondary-alt-ambient--button-pressed-bg,
      ${et("colorSecondaryAltSelectionInteraction01BackgroundSelected",it)}
    );

    --bbva-button-tpv-pad--_ambient--icon-color: var(
      --bbva-button-tpv-pad--custom--secondary-alt-ambient--icon-color,
      ${et("colorSecondaryAltText01Default",it)}
    );

    --bbva-button-tpv-pad--_ambient--icon-pressed-color: var(
      --bbva-button-tpv-pad--custom--secondary-alt-ambient--icon-pressed-color,
      ${et("colorSecondaryAltSelectionInteraction01TextSelected",it)}
    );

    --bbva-button-tpv-pad--_ambient--text-color: var(
      --bbva-button-tpv-pad--custom--secondary-alt-ambient--text-color,
      ${et("colorSecondaryAltText01Default",it)}
    );

    --bbva-button-tpv-pad--_ambient--text-pressed-color: var(
      --bbva-button-tpv-pad--custom--secondary-alt-ambient--text-pressed-color,
      ${et("colorSecondaryAltSelectionInteraction01TextSelected",it)}
    );
  }
`;const Ea=at([Object.freeze({__proto__:null,primary:Ta,primaryAlt:Sa,secondary:Ca,secondaryAlt:Da}),st,ot]),Ma=Object.values(Ea);var Pa=g`
:host {
  display: block;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  position: relative;
  overflow: hidden;
  padding: 0.25rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

ul {
  display: flex;
  width: 100%;
  overflow: hidden;
  list-style: none;
  padding: 0;
  margin-bottom: 0;
  margin-top: 0;
  margin-left: 0;
  flex-wrap: wrap;
}

li {
  display: flex;
  cursor: pointer;
  flex-basis: 33.3333333333%;
  text-align: center;
  justify-content: center;
  padding: 0.25rem;
}

[data-tag-name=bbva-type-icon] {
  fill: var(--_button-tpv-pad-icon-color);
}

[data-tag-name=bbva-type-text] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${b(y.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${b(y.medium.fontStyle)});
  color: var(--_button-tpv-pad-text-color);
}

button {
  all: unset;
  display: flex;
  align-items: center;
  justify-content: center;
  background: var(--_button-tpv-pad-button-bg);
  width: 100%;
  height: 3rem;
}
button:not(.icon):active {
  --_button-tpv-pad-button-bg: var(--_button-tpv-pad-button-pressed-bg);
  --_button-tpv-pad-text-color: var(--_button-tpv-pad-text-pressed-color);
  --_button-tpv-pad-icon-color: var(--_button-tpv-pad-icon-pressed-color);
}
:host([active-buttons]) button.icon:active {
  --_button-tpv-pad-button-bg: var(--_button-tpv-pad-button-pressed-bg);
  --_button-tpv-pad-icon-color: var(--_button-tpv-pad-icon-pressed-color);
}
button[aria-disabled=true] {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}
`;const La={ADD_CART:{icon:k,value:"add_cart"},ADD:{icon:w,value:"add"},DELETE:{icon:x,value:"delete"}};class Ra extends(nt(rt(m(_)))){static get is(){return"bbva-button-tpv-pad"}static get scopedElements(){return{"bbva-type-icon":lt,"bbva-type-text":dt}}static get properties(){return{activeButtons:{type:Boolean,reflect:!0,attribute:"active-buttons"},variant:{type:String}}}constructor(){super(),this.activeButtons=!1,this.variant=La.ADD_CART.value}static get styles(){return[super.styles,xa,Pa,Ma,$("bbva-button-tpv-pad-shared-styles")]}_handleClick(t){this.disabled||this.dispatchEvent(new CustomEvent("button-tpv-pad-click",{bubbles:!0,composed:!0,detail:t}))}_tplText(t){return f`
      <li>
        <button aria-label=${t} @click="${()=>this._handleClick(t)}">
          <bbva-type-text unset size="3XL" alignment="center" .text=${t}> </bbva-type-text>
        </button>
      </li>
    `}_tplIcon(t){return f`
      <li>
        <button
          class="icon"
          aria-label=${this.t(`bbva-button-tpv-pad-${t.value}`)}
          @click="${()=>this.activeButtons&&this._handleClick(t.value)}"
          aria-disabled=${!this.activeButtons&&!this.disabled}
        >
          <bbva-type-icon icon="${t.icon()}" size="24"> </bbva-type-icon>
        </button>
      </li>
    `}get _rightButton(){return Object.values(La).find((t=>t.value===this.variant))||La.ADD_CART}_buttonsTemplate(){return f`
      ${[1,2,3,4,5,6,7,8,9].map((t=>this._tplText(t)))} ${this._tplIcon(La.DELETE)}
      ${this._tplText(0)} ${this._tplIcon(this._rightButton)}
    `}render(){return f`
      <ul>
        ${this._buttonsTemplate()}
      </ul>
    `}}var Ia=g`
:host {
  display: block;
  box-sizing: border-box;
  --_payments-mpos-overview-panel-detail-button-bg: var(--payments-mpos-overview-dark-mode-panel-detail-button-bg, var(--payments-mpos-overview-panel-detail-button-bg, ${et("colorPrimaryLinkMainDefault",it)}));
  --_payments-mpos-overview-panel-detail-button-pressed-bg: var(--payments-mpos-overview-panel-detail-button-pressed-bg, ${et("colorSecondaryCtaPositiveBackgroundPressed",it)});
  --_payments-mpos-overview-panel-detail-button-margin: var(--payments-mpos-overview-panel-detail-button-margin, 1rem 0);
  --_payments-mpos-overview-panel-detail-button-width: var(--payments-mpos-overview-panel-detail-button-width, inherit);
  --_payments-mpos-overview-panel-detail-description-font-style: var(--payments-mpos-overview-panel-detail-description-font-style, italic);
  --_payments-mpos-overview-panel-detail-padding: var(--payments-mpos-overview-panel-detail-padding, 1rem);
  --_payments-mpos-overview-panel-detail-align: var(--payments-mpos-overview-panel-detail-align, left);
  --_payments-mpos-overview-panel-detail-skeleton-animated-layer-bg: var(--payments-mpos-overview-dark-mode-panel-detail-skeleton-animated-layer-bg, var(--payments-mpos-overview-panel-detail-skeleton-animated-layer-bg, ${et("colorPrimarySurfaceAmbientPressed",it)}));
  --_payments-mpos-overview-panel-detail-sticky-bg: var(--payments-mpos-overview-dark-mode-panel-detail-sticky-bg, var(--payments-mpos-overview-panel-detail-sticky-bg, ${et("colorPrimarySurfaceAmbientPressed",it)}));
  --_payments-mpos-overview-panel-detail-success-bg-color: var(--payments-mpos-overview-dark-mode-panel-detail-success-bg-color, var(--payments-mpos-overview-panel-detail-success-bg-color, ${et("colorPrimarySurfaceAmbientPressed",it)}));
  --_payments-mpos-overview-panel-detail-success-color: --payments-mpos-overview-dark-mode-detail-success-color,var(--payments-mpos-overview-success-color, ${et("colorPrimaryAltText01Default",it)});
  --_payments-mpos-overview-skeleton-quote-color: ${et("colorPrimarySurfaceAlternativePreloading",it)};
  --_payments-mpos-overview-skeleton-dark-quote-color: ${et("colorPrimaryLinkMainDefault",it)};
  --_payments-mpos-overview-skeleton-quote-bg: transparent;
  --_payments-mpos-overview-panel-detail-ambient-dark-animated-layer-bg-color: var(--payments-mpos-overview-dark-mode-panel-detail-ambient-dark-animated-layer-bg-color, var(--payments-mpos-overview-panel-detail-ambient-dark-animated-layer-bg-color, ${et("colorSecondaryCtaDisabledBackground",it)}));
  --_payments-mpos-overview-panel-detail-dark-ambient-loading-bg-color: var(--payments-mpos-overview-dark-mode-panel-detail-dark-ambient-loading-bg-color, var(--payments-mpos-overview-panel-detail-dark-ambient-loading-bg-color, ${et("colorSecondaryCtaDisabledBackground",it)}));
  --_payments-mpos-overview-panel-detail-content-amount-text-padding: var(--payments-mpos-overview-panel-detail-content-amount-text-padding, 0.5rem 0 0 0);
  --_payments-mpos-overview-panel-detail-content-amount-amount-padding: var(--payments-mpos-overview-panel-detail-content-amount-amount-padding, 0.5rem 0 0 0);
  --_payments-mpos-overview-panel-detail-date-font-weight: var(--payments-mpos-overview-panel-detail-date-font-weight, inherit);
  --_payments-mpos-overview-panel-detail-date-font-style: var(--payments-mpos-overview-panel-detail-date-font-style, inherit);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([type=success]) [data-tag-name*=bbva-] {
  color: var(--_payments-mpos-overview-panel-detail-success-color);
}

:host([loading]) {
  position: relative;
  margin: auto;
  width: 100%;
  min-height: 16rem;
  background-repeat: no-repeat;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-skeleton-quote-color) 50%);
  background-color: var(--_payments-mpos-overview-skeleton-quote-bg);
  background-size: calc((80% * 2) + (16px/ 2)) 16px, calc((60% * 2) + (16px/ 2)) 16px, calc((60% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 24px, -75% 56px, -75% 110px, 145% 134px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 16rem;
  background: var(--_payments-mpos-overview-panel-detail-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

:host([sticky]) {
  background-color: var(--_payments-mpos-overview-panel-detail-sticky-bg);
  position: sticky;
  display: block;
  bottom: -0.0625rem;
  box-shadow: none;
  transform: translateY(100%);
  animation: sticky-in-animation 500ms cubic-bezier(0, 0, 0.1, 1) 1s 1 normal forwards;
  animation-fill-mode: forwards;
}

:host([shadowed]) {
  box-shadow: 0 -3px 2px 0 rgba(18, 18, 18, 0.08);
}

@keyframes sticky-in-animation {
  from {
    transform: translateY(100%);
  }
  to {
    transform: translateY(0);
  }
}
.content {
  align-items: var(--_payments-mpos-overview-panel-detail-align);
  display: flex;
  flex-direction: column;
  padding: var(--_payments-mpos-overview-panel-detail-padding);
  justify-content: center;
}
.content [data-tag-name=bbva-button-default] {
  background-color: var(--_payments-mpos-overview-panel-detail-button-bg);
  margin: var(--_payments-mpos-overview-panel-detail-button-margin);
  min-width: var(--_payments-mpos-overview-panel-detail-button-width);
}
.content [data-tag-name=bbva-button-default]:active {
  background-color: var(--_payments-mpos-overview-panel-detail-button-pressed-bg);
}
.content__amount {
  display: flex;
  flex-direction: column;
  align-items: var(--_payments-mpos-overview-panel-detail-align);
}
.content__amount [data-tag-name=bbva-type-text] {
  padding: var(--_payments-mpos-overview-panel-detail-content-amount-text-padding);
}
.content__amount [data-tag-name=bbva-type-amount] {
  padding: var(--_payments-mpos-overview-panel-detail-content-amount-amount-padding);
}
.content__description {
  display: flex;
  align-items: var(--_payments-mpos-overview-panel-detail-align);
}
.content__description:first-of-type {
  margin-top: 0.5rem;
}
.content__description [data-tag-name=bbva-type-link] {
  display: inline-grid;
  margin-left: 0.5rem;
}
.content__description [data-tag-name=bbva-type-text] {
  font-style: var(--_payments-mpos-overview-panel-detail-description-font-style);
  padding-top: 0.5rem;
}
.content__description [data-tag-name=bbva-type-amount] {
  font-style: var(--_payments-mpos-overview-panel-detail-description-font-style);
  padding-top: 0.5rem;
  margin-left: 0.5rem;
}
.content__description__additional-text {
  display: grid;
  grid-template-columns: 1fr auto;
}
.content__description__additional-text__left {
  grid-column: 1;
  display: flex;
  flex-wrap: wrap;
}
.content__description__additional-text__left [data-tag-name=bbva-type-text] {
  margin-right: 0.5rem;
}
.content__description__additional-text__left [data-tag-name=bbva-type-amount] {
  margin-right: 0.5rem;
}
.content__description__additional-text__right {
  grid-column: 2;
}
.content__title {
  font-size: var(--typographyTypeXLarge, ${b(T.typeXLarge)});
  line-height: var(--lineHeightTypeXLarge, ${b(S.typeXLarge)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${b(y.medium.fontStyle)});
  font-weight: ${et("fontWeight",y.medium)};
  padding: 0.5rem 0;
}

.badge-wrapper {
  display: flex;
  gap: 0.1875rem;
}
.badge-wrapper [data-tag-name=bbva-type-link] {
  margin-left: 0.5rem;
}

.commission {
  display: flex;
  justify-content: center;
}
.commission [data-tag-name=bbva-type-text] {
  margin-left: 0.25rem;
}

[data-tag-name=bbva-type-date] {
  --bbva-type-text-font-weight: var(--_payments-mpos-overview-panel-detail-date-font-weight);
  --bbva-type-text-font-style: var(--_payments-mpos-overview-panel-detail-date-font-style);
}

:host([ambient=dark400][loading]) {
  background-color: var(--_payments-mpos-overview-panel-detail-dark-ambient-loading-bg-color);
  position: relative;
  margin: auto;
  width: 100%;
  height: 16rem;
  background-repeat: no-repeat;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-skeleton-dark-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-skeleton-dark-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-skeleton-dark-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-skeleton-dark-quote-color) 50%);
  background-color: var(--_payments-mpos-overview-skeleton-quote-bg);
  background-size: calc((80% * 2) + (16px/ 2)) 16px, calc((60% * 2) + (16px/ 2)) 16px, calc((60% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 24px, -75% 56px, -75% 110px, 145% 134px;
}
:host([ambient=dark400][loading]) .skeleton {
  background: var(--_payments-mpos-overview-panel-detail-ambient-dark-animated-layer-bg-color);
  height: 16rem;
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
`;const Aa={light:g`
    ${ct.primaryAlt}
    ${ht.primaryAlt}
    ${pt.primaryAlt}
    ${mt.primaryAlt}
    ${ut.primaryAlt}
    ${st.primaryAlt}
    ${vt.primaryAlt}
  `,dark:g`
    ${ct.secondary}
    ${ht.secondary}
    ${pt.secondary}
    ${mt.secondary}
    ${ut.secondary}
    ${st.secondary}
    ${vt.secondary}
  `},Va="action",Ba="footer",Oa="help";class Fa extends(C(D(_))){static get is(){return"payments-mpos-overview-panel-detail"}static get scopedElements(){const t=[gt,bt,yt,_t,$t,ft,dt];return Fa.scopedElementsFromClasses(t)}static get properties(){return{amount:{type:String},badgeAriaLabel:{type:String,attribute:"badge-aria-label"},badgeIcon:{type:Boolean,attribute:"badge-icon"},badgeStatus:{type:String,attribute:"badge-status"},badgeText:{type:String,attribute:"badge-text"},date:{type:String},dateFormatOptions:{type:Object,attribute:"date-format-options"},description:{type:Array},footerLinkText:{type:String,attribute:"footer-link-text"},language:{type:String},loading:{type:Boolean,reflect:!0},mainText:{type:String,attribute:"main-text"},mainTextAlignment:{type:String,attribute:"main-text-alignment"},microillustration:{type:String},secondaryDescription:{type:String,attribute:"secondary-description"},microillustrationSize:{type:String,attribute:"microillustration-size"},sticky:{type:Boolean,reflect:!0},textAmount:{type:String,attribute:"text-amount"},textButton:{type:String,attribute:"text-button"},type:{type:String,reflect:!0},variant:{type:String}}}static get styles(){return[Ia,Aa.light,Aa.dark,$(`${Fa.is}-shared-styles`)]}constructor(){super(),this.amount="",this.badgeAriaLabel="",this.badgeIcon=!1,this.badgeStatus="default",this.badgeText="",this.clockSuffix="",this.date="",this.dateFormatOptions={},this.description=[],this.footerLinkText="",this.hideHelpIcon=!1,this.language="",this.loading=!1,this.mainText="",this.mainTextAlignment="left",this.microillustration="",this.microillustrationSize="",this.secondaryDescription="",this.sticky=!1,this.textAmount="",this.textButton="",this.type="",this.variant="3xl",this._helpIcon=E()}firstUpdated(){this.sticky&&(this._observer=new IntersectionObserver((([t])=>{t.target.toggleAttribute("shadowed",t.intersectionRatio<1)}),{threshold:1}),this._observer.observe(this))}_handleClick(t,e){t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${this.constructor.is}-${e}-click`,{bubbles:!0,composed:!0}))}get _mainTpl(){return f`
      <bbva-type-text
        alignment="${this.mainTextAlignment}"
        class="content__title"
        size="XL"
        tag="h2"
        text="${this.mainText}"
        unset
      ></bbva-type-text>
    `}get _dateTpl(){return f`
      <bbva-type-date
        clock-suffix="${this.clockSuffix}"
        date="${this.date}"
        locale="${this.language}"
        .options="${this.dateFormatOptions}"
        ?utc="${this.utc}"
      >
      </bbva-type-date>
    `}get _amountTpl(){return f`
      <div class="content__amount">
        ${this.textAmount&&this._textAmountTpl}
        <bbva-type-amount
          amount="${this.amount}"
          currency-code="${M(this.currencyCode)}"
          data-acoustic-obfuscate=""
          disabled-tabindex
          language="${this.language}"
          local-currency="${M(this.localCurrency)}"
          type="bold"
          variant="${this.variant}"
        >
        </bbva-type-amount>
      </div>
    `}get _textAmountTpl(){return f` <bbva-type-text size="S" text="${this.textAmount}" unset> </bbva-type-text> `}_descriptionAmountTpl(t){return f`
      <bbva-type-amount
        amount="${t}"
        currency-code="${M(this.currencyCode)}"
        data-acoustic-obfuscate=""
        disabled-tabindex
        language="${this.language}"
        local-currency="${M(this.localCurrency)}"
        variant="m"
      >
      </bbva-type-amount>
    `}_additionalTextTpl(t){return f`
     <bbva-type-text size="S" text="${t}" unset> </bbva-type-text>
    `}get _descriptionTpl(){const t=this.description.filter((t=>t.text&&!t.additionalText)),e=this.description.filter((t=>t.text&&t.additionalText));return f`
      ${t.map((({amount:t,text:e,iconActive:i})=>f`
          <div class="content__description">
            <bbva-type-text size="S" text="${e}" unset></bbva-type-text>
            ${t&&this._descriptionAmountTpl(t)}
            ${i&&this._helpTpl}
          </div>
        `))}
      ${e.map((({amount:t,text:e,iconActive:i,additionalText:a})=>f`
          <div class="content__description__additional-text">
            <div class="content__description__additional-text__left">
              <bbva-type-text size="S" text="${e}" unset></bbva-type-text>
              ${t&&this._descriptionAmountTpl(t)}
              ${a&&this._additionalTextTpl(a)}
            </div>
            <div class="content__description__additional-text__right">
              ${i&&this._helpTpl}
            </div>
          </div>
        `))}
    `}get _helpTpl(){return f`
      <bbva-type-link
        aria-label="${this.badgeAriaLabel}"
        icon="${this._helpIcon}"
        icon-size="24"
        @click="${t=>this._handleClick(t,Oa)}"
      >
      </bbva-type-link>
    `}get _badgeTpl(){return f`
      <div class="badge-wrapper">
        <bbva-badge-default text="${this.badgeText}" type="${this.badgeStatus}">
        </bbva-badge-default>
        ${this.badgeIcon?this._helpTpl:""}
      </div>
    `}get _actionTpl(){return f`
      <bbva-button-default
        text="${this.textButton}"
        @click="${t=>this._handleClick(t,Va)}"
      >
      </bbva-button-default>
    `}get _contentImageTpl(){return f`
      <bbva-clip-microillustration
        disabled-tabindex
        microillustration="${this.microillustration}"
        size="${this.microillustrationSize}"
      >
      </bbva-clip-microillustration>
    `}get _footerLinkTpl(){return f`
      <div class="content__footer">
        <bbva-type-link @click="${t=>this._handleClick(t,Ba)}"
          >${this.footerLinkText}</bbva-type-link
        >
      </div>
    `}get _contentTpl(){return f`
      <div class="content">
        ${this.microillustration?this._contentImageTpl:""} ${this.mainText&&this._mainTpl}
        ${this.date&&this._dateTpl} ${this.amount&&this._amountTpl} ${this._commissionBadgeTpl}
        ${this.description?this._descriptionTpl:""} ${this.badgeText&&this._badgeTpl}
        ${this.textButton&&this._actionTpl} ${this.footerLinkText&&this._footerLinkTpl}
      </div>
    `}get _panelDetailTpl(){return f`
      ${this.loading?f` <div class="skeleton"></div> `:f` ${this._contentTpl} `}
    `}render(){return f` ${this._panelDetailTpl} `}}var Ha=g`
:host {
  display: block;
  box-sizing: border-box;
  height: 100%;
  width: 100%;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.footer-button {
  padding: 0.75rem 1rem 0;
}

[data-tag-name=bbva-form-input] {
  margin: 1rem;
  text-align: initial;
}

[data-tag-name=calculator-footer].fixed {
  position: fixed;
  bottom: 1rem;
  left: 0;
  right: 0;
}

[data-tag-name=bbva-help-modal] {
  text-align: initial;
  --bbva-help-modal-padding: 0;
  --bbva-help-modal-footer-padding: 0;
}

[data-tag-name=payments-mpos-overview-panel-detail] {
  margin-bottom: 1rem 0;
  --payments-mpos-overview-panel-detail-padding: 0 1rem 1rem;
}
`;class Na extends(D(la(m(P(_e(na(_))))))){static get is(){return"payments-mpos-overview-calculator"}static get scopedElements(){const t=[Ra,Nt,kt,bt,Fa];return Na.scopedElementsFromClasses(t)}static get properties(){return{hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},iva:{type:String},merchantName:{type:String,attribute:"merchant-name"},visible:{type:Boolean},_description:{type:String},_disabledTpv:{type:Boolean},_isChargeButtonEnabled:{type:Boolean},_isDescriptionPatternValid:{type:Boolean},_products:{type:Array},_totalPrice:{type:Number},_numberOfProducts:{type:Number},_price:{type:Number},_totalProductPrice:{type:Number},_totalUnits:{type:Number},_units:{type:Number}}}constructor(){super(),this.hasFeatureHeaderHidden=!1,this.iva="",this.localCurrency="",this.merchantName="",this.visible=!1,this._accUnits=0,this._closeModalElements=["header-right-primary"],this._description="",this._disabledTpv=!1,this._isChargeButtonEnabled=!1,this._isDescriptionPatternValid=!1,this._numberOfProducts=1,this._price=0,this._products=[],this._totalPrice=0,this._totalProductPrice=0,this._totalUnits=0,this._units=1}static get styles(){return[Ha,$("payments-mpos-overview-calculator-shared-styles"),pt.primaryAlt,Ea.primaryAlt,Ht.primaryAlt]}firstUpdated(){this._dispatchEvent(`${this.constructor.is}-action-step-load`,{step:1})}updated(t){t.forEach(((t,e)=>{"_numberOfProducts"===e&&t!==this[e]&&(this._addUnit=!0),"_price"!==e&&"_units"!==e||t===this[e]||(this._totalProductPrice=Number((this._price*this._units).toFixed(2))),"_price"!==e&&"_units"!==e&&"_isDescriptionPatternValid"!==e||this._products.length||(this._isChargeButtonEnabled=0!==this._price&&this._units>0&&this._isDescriptionPatternValid),"visible"===e&&(this.visible?()=>this.addView(this):()=>{this.closeView(this),this._dispatchEvent(`${this.constructor.is}-exit-calculator`)})()}))}_handleTpvClick(t){"number"==typeof t.detail?this._insertNumberTpv(t.detail):this[`_${t.detail}`](),this._dispatchEvent(`${this.constructor.is}-action-click`,t.detail)}_insertNumberTpv(t){String(Math.round(this._price)).length<=7&&(this._price=Number((10*this._price+t/100).toFixed(2)),this._addUnit&&0!==this._price&&(this._totalUnits+=this._units,this._addUnit=!1))}_add(){this._units<1||0===this._price||(this._addCurrentProduct(),this._accUnits=this._totalUnits,this._numberOfProducts+=1,this._resetInputs())}_delete(){const t=this._price/10;this._price=Math.floor(100*t)/100,0===this._price&&(this._totalUnits=this._accUnits,this._addUnit=!0)}_resetInputs(){this._price=0,this._totalProductPrice=0,this._units=1,this._description=""}_onUnitsChange(t){var e;this._units=Number((null===(e=t.composedPath()[0])||void 0===e?void 0:e.value)||1),0!==this._price&&(this._totalUnits=this._accUnits+this._units)}_clearUnitsInput(){this._units=1,this._totalUnits=this._accUnits,this._addUnit=!0}_onDescriptionChange(t){var e;this._description=null===(e=t.composedPath()[0])||void 0===e?void 0:e.value}_onDescriptionValidate({detail:{invalid:t}}){this._isDescriptionPatternValid=!t}_getIvaAmount(){return Number.isNaN(Number(this.iva))?0:Number(this.iva/100).toFixed(2)*this._totalProductPrice}_addCurrentProduct(){this._products.push({totalProductPrice:this._totalProductPrice,unitPrice:this._price,units:this._units,iva:this.iva,ivaAmount:this._getIvaAmount(),description:this._description}),this._isChargeButtonEnabled=!0,this._totalPrice+=this._totalProductPrice}_getTotalUnits(t){return t<2?"":`(${this._totalUnits})`}_onClickCtaButton(){0!==this._price&&this._addCurrentProduct(),this._dispatchEvent(`${this.constructor.is}-cta-button-click`,{products:this._products,totalPrice:this._totalPrice}),this._resetInputs(),this._numberOfProducts=1,this._totalUnits=0,this._totalPrice=0,this._products=[]}get _panelAmountTpl(){return f`
      <payments-mpos-overview-panel-detail
        amount="${this._price}"
        currency-code="${this.currencyCode}"
        language="${this.language}"
        local-currency="${this.localCurrency}"
        .description="${[{text:this.getIvaText(this.iva)},{text:this.t(`${this.constructor.is}-total-price`),amount:(this._totalPrice+this._totalProductPrice).toFixed(2)}]}"
      >
      </payments-mpos-overview-panel-detail>
    `}get _unitsToShow(){return String(this._units>1?this._units:"")}get _unitsInputTpl(){return f`
      <bbva-form-input
        ambient="primary-alt"
        allowed-pattern="[0-9]"
        auto-validate
        min="1"
        error-message="${this.t(`${this.constructor.is}-error-units`)}"
        label="${this.t(`${this.constructor.is}-units`)}"
        type="number"
        .value="${this._unitsToShow}"
        @focusin="${()=>{this._dispatchEvent(`${this.constructor.is}-action-click`,"units"),this._disabledTpv=!0}}"
        @focusout="${()=>{this._disabledTpv=!1}}"
        @form-field-input-clear="${this._clearUnitsInput}"
        @input="${this._onUnitsChange}"
      ></bbva-form-input>
    `}get _descriptionTpl(){return f`
      <bbva-form-input
        auto-validate
        ambient="primary-alt"
        error-message="${this.t(`${Fe}-no-emojis-allowed`)}"
        maxlength="250"
        pattern=${Ci}
        type="text"
        optional-label="${this.t(`${this.constructor.is}-description`)}"
        .value="${this._description}"
        @focusin="${()=>{this._dispatchEvent(`${this.constructor.is}-action-click`,"description"),this._disabledTpv=!0}}"
        @focusout="${()=>{this._disabledTpv=!1}}"
        @form-field-input-clear="${()=>{this._description=""}}"
        @form-field-input-validate="${this._onDescriptionValidate}"
        @input="${this._onDescriptionChange}"
      >
      </bbva-form-input>
    `}get _tpvPadFooterTpl(){return f`
      <div data-tag-name="calculator-footer" class="${L({fixed:!this._disabledTpv})}">
        <bbva-button-tpv-pad
          active-buttons
          ambient="primary-alt"
          variant="add"
          ?disabled="${this._disabledTpv}"
          @button-tpv-pad-click="${t=>this._handleTpvClick(t)}"
        >
        </bbva-button-tpv-pad>
        <div class="footer-button">
          <bbva-button-default
            fullwidth
            text="${this.t(`${this.constructor.is}-cta-button`)}
              ${this._getTotalUnits(this._numberOfProducts,this._totalUnits)}"
            ?disabled="${!this._isChargeButtonEnabled}"
            @click="${this._onClickCtaButton}"
          >
          </bbva-button-default>
        </div>
      </div>
    `}render(){return f`
      <bbva-help-modal
        aria-label="${this.t(`${this.constructor.is}-modal`)}"
        header-close-icon-aria-label="${this.t("close-modal")}"
        full-height
        header-text="${this.hasFeatureHeaderHidden?"":this.merchantName}"
        header-type="modal"
        hide-content-padding-top
        ?visible="${this.visible}"
        .closeModalElements="${this._closeModalElements}"
        @help-modal-header-click="${t=>{t.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-exit-calculator`),this.visible=!1}}"
      >
        <div class="content" slot="slot-content">
          ${this._panelAmountTpl} ${this._unitsInputTpl} ${this._descriptionTpl}
          ${this._tpvPadFooterTpl}
        </div>
      </bbva-help-modal>
    `}}var za=g`
:host {
  display: block;
  position: relative;
  box-sizing: border-box;
  padding: 1rem;
  border: none;
  --_payments-mpos-overview-item-link-heading-link-color: var(--payments-mpos-overview-dark-mode-item-link-heading-link-color,var(--payments-mpos-overview-item-link-heading-link-color,${et("colorPrimaryLinkMainDefault",it)}));
  --_payments-mpos-overview-item-link-description-color: var(--payments-mpos-overview-dark-mode-item-link-description-color,var(--payments-mpos-overview-item-link-description-color, ${et("colorPrimaryText02Default",it)}));
  --_payments-mpos-overview-item-link-active-color: var(--payments-mpos-overview-dark-mode-item-link-active-color, var(--payments-mpos-overview-item-link-active-color, ${et("colorPrimarySurfaceAmbientOverlay",it)}));
  --skeleton-quote-color: var(--payments-mpos-overview-item-link-skeleton-color, ${et("colorPrimarySurfaceAlternativePreloading",it)});
  --skeleton-quote-bg: var(--payments-mpos-overview-item-link-skeleton-bg, transparent);
  --_payments-mpos-overview-item-link-skeleton-animated-layer-bg: var(--payments-mpos-overview-dark-mode-item-link-skeleton-animated-layer-bg, var(--payments-mpos-overview-item-link-skeleton-animated-layer-bg, ${et("colorPrimarySurfaceAmbientPressed",it)}));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host(:active) {
  background-color: var(--payments-mpos-overview-dark-mode-item-link-active-bg-color, var(--payments-mpos-overview-item-link-active-bg-color, ${et("colorPrimarySurfaceAmbientDefault",it)}));
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.info-wrapper {
  align-items: center;
  display: flex;
  gap: 0.5rem;
}

.header {
  display: flex;
  justify-content: space-between;
}
.header .heading-link {
  text-align: left;
  justify-content: flex-start;
  flex: 1;
  padding-left: 0;
}

.description {
  margin: 0;
  font-size: var(--payments-mpos-overview-item-link-description-font-size, ${et("typeSmall",T)});
  line-height: var(--payments-mpos-overview-item-link-description-line-height, ${et("typeSmall",S)});
  font-weight: var(--payments-mpos-overview-item-link-description-font-weight, ${et("fontWeight",y.book)});
  color: var(--_payments-mpos-overview-item-link-description-color, ${et("colorPrimaryText02Default",it)});
}

:host([loading]) {
  position: relative;
  height: 5.125rem;
  pointer-events: none;
  background-repeat: no-repeat;
  background-image: linear-gradient(var(--skeleton-quote-color, ${et("colorPrimarySurfaceAlternativePreloading",it)}) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color, ${et("colorPrimarySurfaceAlternativePreloading",it)}) 50%), linear-gradient(-60deg, var(--skeleton-quote-color, ${et("colorPrimarySurfaceAlternativePreloading",it)}) 50%, transparent 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 28px 28px, calc((40% * 2) + (18px/ 2)) 18px, calc((8% * 2) + (18px/ 2)) 18px;
  background-position: 16px 18px, 51px 23px, calc(100% - 16px) 23px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 5.125rem;
  background: var(--_payments-mpos-overview-item-link-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
`;const Ua="Enter",qa="Space";class ja extends(R(D(_))){static get is(){return"payments-mpos-overview-item-link"}static get scopedElements(){const t=[lt,ft];return ja.scopedElementsFromClasses(t)}static get properties(){return{clipIcon:{type:String,attribute:"clip-icon"},headerDescription:{type:String,attribute:"header-description"},headerText:{type:String,attribute:"header-text"},linkIcon:{type:String,attribute:"link-icon"},linkIconLeft:{type:String,attribute:"link-icon-left"},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.clipIcon=null,this.headerDescription=null,this.headerText=null,this.linkIcon=null,this.linkIconLeft=null,this.loading=!1}static get styles(){return[za,ot.primaryAlt,ut.primaryAlt,I(),$("payments-mpos-overview-item-link-shared-styles")]}_linkClicked(){this.dispatchEvent(new CustomEvent(`${this.constructor.is}-click`,{bubbles:!0,composed:!0}))}get _itemLinkTpl(){return f`
      ${this.loading?f` <div class="skeleton"></div> `:f` ${this._headerTpl} `}
    `}get _headerTpl(){return f`
      <div
        class="item-wrapper"
        @click="${this._linkClicked}"
        @keypress="${t=>(t.code===Ua||t.code===qa)&&this._linkClicked()}"
      >
        <div class="info-wrapper">
          <div class="header">
            <bbva-type-link
              class="heading-link"
              icon-size="24"
              .icon="${this.clipIcon?this.clipIcon:this.linkIconLeft}"
            >
              <span class="link-text">${this.headerText}</span>
            </bbva-type-link>
          </div>
        </div>
        <slot id="description" name="description"> ${this._itemDescriptionTpl} </slot>
      </div>
    `}get _itemDescriptionTpl(){return f`
      <p
        id="header-description"
        class="description ${L({"icon-left":this.linkIconLeft})}"
        ?hidden="${!this.headerDescription}"
      >
        ${this.headerDescription}
      </p>
    `}render(){return f` ${this._itemLinkTpl} `}}var Wa=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.charge-methods__wrapper > [data-tag-name=bbva-type-text] {
  padding: 0 0.5rem;
}
.charge-methods__header {
  display: flex;
  align-items: center;
}

.divider__wrapper {
  padding-inline: 1rem;
}
.divider__wrapper:last-child {
  display: none;
}
`;class Ja extends(D(m(_e(_)))){static get is(){return"payments-mpos-overview-step-charge-methods"}static get scopedElements(){const t=[xt,dt,ja];return Ja.scopedElementsFromClasses(t)}static get properties(){return{chargeMethods:{type:Array,attribute:"charge-methods"}}}constructor(){super(),this.chargeMethods=[]}static get styles(){return[Wa,wt.primaryAlt,st.primaryAlt,$("payments-mpos-overview-step-charge-methods-shared-styles")]}_getTranslation(t){return this.t(`${this.constructor.is}-${t}`)}_selectChargeMethod(t){this._dispatchEvent(`${this.constructor.is}-method-select`,t)}render(){return f`
      <div class="charge-methods__wrapper">
        <bbva-type-text
          text="${this._getTranslation("description")}"
          inherit
          size="S"
        ></bbva-type-text>
        ${this.chargeMethods.map((t=>f`
            <payments-mpos-overview-item-link
              clip-icon="${ni[t.id].icon}"
              header-description="${this._getTranslation("openpay-text")}"
              header-text="${this._getTranslation(t.id.toLowerCase())}"
              @payments-mpos-overview-item-link-click="${()=>this._selectChargeMethod(t.id)}"
            >
            </payments-mpos-overview-item-link>
            <div class="divider__wrapper"><bbva-divider-default></bbva-divider-default></div>
          `))}
      </div>
    `}}var Ga=g`
:host {
  width: 100%;
  padding-bottom: 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Xa extends(D(m(_e(_)))){static get is(){return"payments-mpos-overview-form-email"}static get scopedElements(){const t=[Nt];return Xa.scopedElementsFromClasses(t)}static get styles(){return[Ga,Ht.primaryAlt,$(`${Xa.is}-shared-styles`)]}static get properties(){return{infoMessage:{type:String,attribute:"info-message"},mail:{type:String}}}static _handleSelected(t){const{target:e}=t;e.autoValidate=!0}constructor(){super(),this.infoMessage="",this.mail="",this._activeConfig=!1}_handleInput(t){const{value:e}=t.composedPath()[0];(t=>{const e=new RegExp(Si);return t.match(e)})(e)?(this.mail=e.toLowerCase(),this._dispatchEvent(`${this.constructor.is}-valid-set`,this.mail)):this._dispatchEvent(`${this.constructor.is}-invalid-set`,!0)}render(){return f`
      <bbva-form-input
        ambient="primary-alt"
        error-message="${this.t(`${this.constructor.is}-error-message`)}"
        label="${this.t(`${this.constructor.is}-label`)}"
        pattern="${Si}"
        maxlength="100"
        required
        type="text"
        @form-field-input-clear="${()=>this._dispatchEvent(`${this.constructor.is}-invalid-set`,!0)}"
        @form-field-input-focus="${this.constructor._handleSelected}"
        @input="${this._handleInput}"
      ></bbva-form-input>
    `}}var Ya=g`
:host {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  box-sizing: border-box;
  padding: 0 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-form-input] {
  margin-bottom: 1rem;
}

[data-tag-name=bbva-notification-message] {
  margin-bottom: 1rem;
}
`;class Ka extends(D(m(_e(wa(_))))){static get is(){return"payments-mpos-overview-step-payment-link"}static get scopedElements(){const t=[bt,Nt,Tt,Xa];return Ka.scopedElementsFromClasses(t)}static get styles(){return[Ya,pt.primaryAlt,Ht.primaryAlt,$(`${Ka.is}-shared-styles`)]}static get properties(){return{expirationDays:{type:String,attribute:"expiration-days"},mail:{type:String},_name:{type:String},_invalidEmail:{type:Boolean},_isNamePatternValid:{type:Boolean}}}constructor(){super(),this.expirationDays="",this.mail="",this._name="",this._invalidEmail=!1,this._isNamePatternValid=!1}firstUpdated(){this._invalidEmail=!0}_handleInput(t){this._name=t.composedPath()[0].value}_handleNameInputErrorLiteral(){return this._name.length?this._isNamePatternValid?"":this.t(`${Fe}-no-emojis-allowed`):this.t(`${this.constructor.is}-name-required`)}_onDescriptionValidate({detail:{invalid:t}}){this._isNamePatternValid=!t}_sendData(){this._dispatchEvent(`${this.constructor.is}-mailto`,{email:this.mail,name:this._name})}_setEmail(t){this._invalidEmail=!1,this.mail=t}render(){return f`
      <bbva-form-input
        ?auto-validate=${this._name.length}
        ambient="primary-alt"
        error-message="${this._handleNameInputErrorLiteral()}"
        label="${this.t(`${this.constructor.is}-customer-name`)}"
        label-out="${this.t(`${this.constructor.is}-label-out`)}"
        maxlength="100"
        pattern=${Ci}
        required
        value=""
        type="text"
        @form-field-input-validate="${this._onDescriptionValidate}"
        @form-field-input-clear="${()=>{this._name=""}}"
        @input="${this._handleInput}"
      ></bbva-form-input>
      <payments-mpos-overview-form-email
        info-message="${this.t(`${this.constructor.is}-info-message`)}"
        mail="${this.mail}"
        @payments-mpos-overview-form-email-valid-set="${({detail:t})=>this._setEmail(t)}"
        @payments-mpos-overview-form-email-invalid-set="${()=>{this._invalidEmail=!0}}"
      >
      </payments-mpos-overview-form-email>
      <bbva-notification-message
        book-title
        message-title="${this.t(`${this.constructor.is}-process-message`,{days:this.getValidPeriodLinkText(this.expirationDays)})}"
      ></bbva-notification-message>
      <bbva-button-default
        fullwidth
        @click="${this._sendData}"
        ?disabled="${this._invalidEmail||!this._name||!this._isNamePatternValid}"
        >${this.t(`${this.constructor.is}-continue`)}
      </bbva-button-default>
    `}}var Za=g`
:host {
  display: flex;
  justify-content: space-between;
  align-items: start;
  box-sizing: border-box;
  --_payments-mpos-overview-item-action-action-icon-color: var(--payments-mpos-overview-item-action-action-icon-color, ${et("colorPrimaryLinkMainDefault",it)});
  --_payments-mpos-overview-item-action-bg-active-color: var(--payments-mpos-overview-dark-mode-item-action-bg-active-color, var(--payments-mpos-overview-item-action-bg-active-color, ${et("colorPrimarySurfaceAmbientDefault",it)}));
  --_payments-mpos-overview-item-action-detail-color: var(--payments-mpos-overview-dark-mode-item-action-detail-color, var(--payments-mpos-overview-item-action-detail-color, ${et("colorPrimaryText02Default",it)}));
  --_payments-mpos-overview-item-action-detail-font-style: var(--payments-mpos-overview-item-action-detail-font-style, ${et("fontStyle",y.book)});
  --_payments-mpos-overview-item-action-main-content-color: var(--payments-mpos-overview-dark-mode-item-action-main-content-color, var(--payments-mpos-overview-item-action-main-content-color, ${et("colorPrimaryAltText01Default",it)}));
  --_payments-mpos-overview-skeleton-quote-color: var(--payments-mpos-overview-item-action-skeleton-color, ${et("colorPrimarySurfaceAlternativePreloading",it)});
  --_payments-mpos-overview-skeleton-quote-bg: var(--payments-mpos-overview-item-action-skeleton-bg, transparent);
  --_payments-mpos-overview-item-action-skeleton-animated-layer-bg: var(--payments-mpos-overview-dark-mode-item-action-skeleton-animated-layer-bg, var(--payments-mpos-overview-item-action-skeleton-animated-layer-bg, ${et("colorPrimarySurfaceAmbientPressed",it)}));
  padding: var(--payments-mpos-overview-item-action-padding, 1rem);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host(:active) {
  background-color: var(--_payments-mpos-overview-item-action-bg-active-color);
}

:host([loading]) {
  position: relative;
  pointer-events: none;
  height: 5.125rem;
  background-repeat: no-repeat;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_payments-mpos-overview-skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-skeleton-quote-color) 50%);
  background-color: var(--_payments-mpos-overview-skeleton-quote-bg);
  background-size: calc((40% * 2) + (16px/ 2)) 16px, calc((8% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px;
  background-position: 16px 18px, calc(100% - 16px) 18px, 16px 48px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 5.125rem;
  background: var(--_payments-mpos-overview-item-action-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

.actions {
  display: flex;
}
.actions .icon {
  background: none;
  border: none;
}
.actions .icon [data-tag-name=bbva-type-icon] {
  fill: ${et("colorPrimaryLinkMainDefault",it)};
}

.main-content {
  flex-grow: 1;
  overflow: hidden;
  color: var(--_payments-mpos-overview-item-action-main-content-color);
  line-height: ${et("typeSmall",S)};
}
.main-content .title {
  font-weight: ${et("fontWeight40",A)};
  font-size: ${et("fontSize60",V)};
}
.main-content [data-tag-name=bbva-type-amount] {
  color: var(--_payments-mpos-overview-item-action-main-content-color);
  font-style: ${et("fontStyle20",B)};
}
.main-content .detail {
  font-size: ${et("fontSize40",V)};
  font-style: var(--_payments-mpos-overview-item-action-detail-font-style);
  margin-top: 0.5rem;
  color: var(--_payments-mpos-overview-item-action-detail-color);
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
`;const Qa={EDIT:{icon:n(),value:"edit"},DELETE:{icon:O(),value:"delete"}};class ts extends(P(D(m(_)))){static get is(){return"payments-mpos-overview-item-action"}static get scopedElements(){const t=[_t,lt,dt];return ts.scopedElementsFromClasses(t)}static get properties(){return{amount:{type:String},detail:{type:String},ellipsisTitle:{type:Number,attribute:"ellipsis-title"},ellipsisDetail:{type:Number,attribute:"ellipsis-detail"},loading:{type:Boolean,reflect:!0},titleItem:{type:String,attribute:"title-item"}}}constructor(){super(),this.amount="",this.detail="",this.ellipsisTitle=0,this.ellipsisDetail=0,this.language="",this.loading=!1,this.titleItem=""}static get styles(){return[Za,ht.primaryAlt,ot.primaryAlt,st.primaryAlt,$("payments-mpos-overview-item-action-shared-styles")]}_buttonIconClicked(t){this.dispatchEvent(new CustomEvent(`${this.constructor.is}-${t}`,{bubbles:!0,composed:!0}))}_tplIcon(t){return f`
      <button
        class="icon"
        aria-label="${this.t(`${this.constructor.is}-${t.value}`)}"
        @click="${()=>this._buttonIconClicked(t.value)}"
      >
        <bbva-type-icon icon="${t.icon}" size="24"> </bbva-type-icon>
      </button>
    `}get _descriptionTpl(){return this.amount?f`
          <bbva-type-amount
            amount="${this.amount}"
            currency-code="${this.currencyCode}"
            data-acoustic-obfuscate
            language="${this.language}"
            local-currency="${this.localCurrency}"
            text="${this.t(`${this.constructor.is}-units`)}"
            type="bold"
            variant="m"
          ></bbva-type-amount>
        `:f` <slot></slot> `}get _mainContentTpl(){return f`
      <div class="main-content">
        <bbva-type-text
          class="title"
          lines="${this.ellipsisTitle}"
          tabindex="0"
          text="${this.titleItem}"
          unset
          ?ellipsis="${!!this.ellipsisTitle}"
        >
        </bbva-type-text>
        ${this._descriptionTpl}
        <bbva-type-text
          class="detail"
          lines="${this.ellipsisDetail}"
          tabindex="0"
          text="${this.detail}"
          unset
          ?ellipsis="${!!this.ellipsisDetail}"
        >
        </bbva-type-text>
      </div>
    `}get _itemActionTpl(){return f`
      ${this.loading?f` <div class="skeleton"></div> `:f` ${this._mainContentTpl} ${this._actionsTpl} `}
    `}get _actionsTpl(){return f`
      <div class="actions">
        ${this._tplIcon(Qa.EDIT)} ${this._tplIcon(Qa.DELETE)}
      </div>
    `}render(){return f` ${this._itemActionTpl} `}}var es=g`
:host {
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: 0.5rem 1rem;
  min-height: 1.5rem;
  --_payments-mpos-overview-list-simple-label-font-weight: var(--payments-mpos-overview-list-simple-label-font-weight, ${et("fontWeight",y.book)});
  --_payments-mpos-overview-list-simple-description-text-font-weight: var(--payments-mpos-overview-list-simple-description-text-font-weight, ${et("fontWeight",y.book)});
  --_payments-mpos-overview-list-simple-description-text-font-style: var(--payments-mpos-overview-list-simple-description-text-font-style, ${et("fontStyle",y.book)});
  --_payments-mpos-overview-list-simple-description-text-font-color: var(--payments-mpos-overview-dark-mode-list-simple-description-text-font-color, var(--payments-mpos-overview-list-simple-description-text-font-color, ${et("colorPrimaryAltText01Default",it)}));
  --_payments-mpos-overview-list-simple-description-amount-font-weight: var(--payments-mpos-overview-list-simple-description-amount-font-weight, ${et("fontWeight",y.book)});
  --_payments-mpos-overview-list-simple-description-date-font-weight: var(--payments-mpos-overview-list-simple-description-date-font-weight, ${et("fontWeight",y.book)});
  --_payments-mpos-overview-list-simple-label-text-color: var(--payments-mpos-overview-dark-mode-list-simple-label-text-color, var(--payments-mpos-overview-list-simple-label-text-color, ${et("colorPrimaryAltText01Default",it)}));
  --_payments-mpos-overview-list-simple-icon-fill: var(--payments-mpos-overview-dark-mode-list-simple-icon-fill, var(--payments-mpos-overview-list-simple-icon-fill, ${et("colorPrimaryLinkMainDefault",it)}));
  --_payments-mpos-overview-list-simple-ambient-dark-label-text-color: var(--payments-mpos-overview-list-simple-ambient-dark-label-text-color, ${et("colorPrimarySurfaceAmbientPressed",it)});
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-type-icon] {
  color: ${et("colorPrimaryLinkMainDefault",it)};
  fill: var(--_payments-mpos-overview-list-simple-icon-fill);
}
[data-tag-name=bbva-type-icon]:active {
  color: ${et("colorPrimarySurfaceAmbientOverlay",it)};
}

.container {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 1rem;
  width: 100%;
  word-break: break-word;
}

.label-container {
  flex-grow: 1;
  overflow: hidden;
  align-items: center;
  gap: 0.5rem;
}
.label-container [data-tag-name=bbva-type-text] {
  min-width: 0;
  font-weight: var(--_payments-mpos-overview-list-simple-label-font-weight);
  color: var(--_payments-mpos-overview-list-simple-label-text-color);
}

.description-container {
  min-width: 0;
}
.description-container > [data-tag-name=bbva-type-text] {
  font-weight: var(--_payments-mpos-overview-list-simple-description-text-font-weight);
  font-style: var(--_payments-mpos-overview-list-simple-description-text-font-style);
  color: var(--_payments-mpos-overview-list-simple-description-text-font-color);
}
.description-container > [data-tag-name=bbva-type-amount] {
  font-weight: var(--_payments-mpos-overview-list-simple-description-amount-font-weight);
}

:host([ambient*=dark]) .label-container [data-tag-name=bbva-type-text] {
  color: var(--_payments-mpos-overview-list-simple-ambient-dark-label-text-color);
}

.actions-container {
  display: flex;
  gap: 1rem;
}

:host([label-ellipsis]:not([description-ellipsis])) .description-container {
  flex-shrink: 0;
}

:host([description-ellipsis]:not([label-ellipsis])) .label-container {
  flex-shrink: 0;
}

:host([variant=stacked]) .container, :host([actions-icons]) .container {
  flex-direction: column;
  align-items: initial;
  gap: 0;
}
:host([variant=stacked]) .stacked-container, :host([actions-icons]) .stacked-container {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 1rem;
}

:host([variant=stacked][detail]) .label-container {
  justify-content: space-between;
}

:host([loading]) {
  position: relative;
  display: inline-block;
  top: 0;
  left: 0;
  width: 100%;
  height: 4rem;
  pointer-events: none;
  background-repeat: no-repeat;
  transition: opacity 0.4s ease-in-out;
  background-image: linear-gradient(-60deg, transparent 50%, ${et("colorPrimarySurfaceAmbientDefault",it)} 50%), linear-gradient(-60deg, transparent 50%, ${et("colorPrimarySurfaceAmbientDefault",it)} 50%);
  background-color: transparent;
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 24px 36px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}
`;const is={primary:g`
    ${ht.primaryAlt}
    ${st.primaryAlt}
    ${mt.primaryAlt}
    ${ot.primaryAlt}
  `,secondary:g`
    ${ht.secondary}
    ${st.secondary}
    ${mt.secondary}
    ${ot.secondary}
  `};class as extends(P(D(m(_)))){static get is(){return"payments-mpos-overview-list-simple"}static get scopedElements(){const t=[_t,$t,dt,lt];return as.scopedElementsFromClasses(t)}static get properties(){return{actionsIcons:{type:Boolean,attribute:"actions-icons",reflect:!0},amount:{type:Number},amountDescription:{type:String,attribute:"amount-description"},date:{type:String},dateFormatOptions:{type:Object,attribute:"date-format-options"},description:{type:String},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis",reflect:!0},detail:{type:String,reflect:!0},helpIcon:{type:Boolean,attribute:"help-icon",reflect:!0},label:{type:String},labelEllipsis:{type:Boolean,attribute:"label-ellipsis",reflect:!0},loading:{type:Boolean,reflect:!0},variant:{type:String,reflect:!0}}}constructor(){super(),this.actionsIcons=!1,this.amount=null,this.amountDescription="",this.date="",this.dateFormatOptions={},this.description="",this.descriptionEllipsis=!1,this.detail=null,this.helpIcon=!1,this.label="",this.labelEllipsis=!1,this.loading=!1,this.variant=""}static get styles(){return[es,is.primary,is.secondary,$("payments-mpos-overview-list-simple-shared-styles")]}_iconClick(t){this.dispatchEvent(new CustomEvent(`payments-mpos-overview-list-simple-${t}-icon-click`,{bubbles:!0,composed:!0}))}get _labelTpl(){return f`
      <bbva-type-text
        unset
        size="S"
        text="${this.label}"
        ?ellipsis="${this.labelEllipsis}"
      ></bbva-type-text>
    `}get _descriptionTpl(){const t=null!==this.amount&&!Number.isNaN(Number(this.amount));return this.description?f`
        <bbva-type-text
          alignment="right"
          lines="4"
          size="S"
          text="${this.description}"
          unset
          ?ellipsis="${this.descriptionEllipsis}"
        ></bbva-type-text>
      `:t?f`
        <bbva-type-amount
          amount="${this.amount}"
          currency-code="${this.currencyCode}"
          data-acoustic-obfuscate
          disabled-tabindex
          language="${this.language}"
          local-currency="${this.localCurrency}"
          text="${M(this.amountDescription)}"
          variant="m"
        ></bbva-type-amount>
      `:this.date?f`
        <bbva-type-date
          font-weight="500"
          date="${this.date}"
          locale="${this.language}"
          .options="${Ee}"
        >
        </bbva-type-date>
      `:f``}get _helpIconTpl(){return this.helpIcon?f`
        <bbva-type-icon
          icon="${E()}"
          size="24"
          @click="${()=>this._iconClick("help")}"
        ></bbva-type-icon>
      `:f``}get _detailTpl(){return this.detail?f` <bbva-type-text unset size="S" text="${this.detail}"></bbva-type-text> `:f``}get _actionIconsTpl(){return this.actionsIcons?f`
        <div class="actions-container">
          <bbva-type-icon
            icon="${n()}"
            size="24"
            @click="${()=>this._iconClick("edit")}"
          ></bbva-type-icon>
          <bbva-type-icon
            icon="${O()}"
            size="24"
            @click="${()=>this._iconClick("trash")}"
          ></bbva-type-icon>
        </div>
      `:f``}render(){return f`
      <div class="stacked-container">
        <div class="container">
          <div class="label-container">
            ${this._labelTpl} ${this._helpIconTpl} ${this._detailTpl}
          </div>
          <div class="description-container">${this._descriptionTpl}</div>
        </div>
        ${this._actionIconsTpl}
      </div>
    `}}var ss=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 1.5rem 1rem 0;
}

[data-tag-name=payments-mpos-overview-list-simple] {
  --payments-mpos-overview-list-simple-description-amount-font-weight: ${et("fontWeight",y.medium)};
}

[data-tag-name=payments-mpos-overview-item-action] {
  --payments-mpos-overview-item-action-bg-active-color: transparent;
}

.continue-button-container {
  align-items: center;
  display: flex;
  flex-direction: column;
  margin-top: 1.5rem;
  padding: 0 1rem;
}

.fit {
  padding-left: 1rem;
  padding-right: 1rem;
}
`;class os extends(D(m(P(la(_e(_)))))){static get is(){return"payments-mpos-overview-step-summary"}static get scopedElements(){const t=[bt,xt,kt,ts,ja,as];return os.scopedElementsFromClasses(t)}static get styles(){return[ss,pt.primaryAlt,wt.primaryAlt,$(`${os.is}-shared-styles`)]}static get properties(){return{language:{type:String},products:{type:Array},_isWarningModalVisible:{type:Boolean},_totalPrice:{type:Number}}}constructor(){super(),this.currencyCode="",this.language="",this.localCurrency="",this.products=[],this._isSameIva=!1,this._totalPrice=0,this._totalIva=0,this._isEditModalVisible=!1,this._isWarningModalVisible=!1}firstUpdated(){this._updateMultistepData()}_handleModalButton(){this.products=[],this._isWarningModalVisible=!1,this._dispatchEvent(`${this.constructor.is}-calculator-navigate`)}_handleModalLink(){this._isWarningModalVisible=!1}_handleDeleteClick(t){1===this.products.length?this._isWarningModalVisible=!0:this._dispatchEvent(`${this.constructor.is}-product-remove`,{productIndex:t})}_updateMultistepData(){this._dispatchEvent(`${this.constructor.is}-data-update`,{products:this.products,totalPrice:this._totalPrice.toFixed(2),totalIva:this._totalIva,isSameIva:this._isSameIva})}_handleEditProductClick(t,e){const i={...t,index:e};this._dispatchEvent(`${this.constructor.is}-product-edit`,{product:i})}_setDefaultDescription(t,e){const i={...t},a=this.t(`${this.constructor.is}-sale`),s=`${this.t(`${this.constructor.is}-product`)} ${e+1}`;return i.description||(1===this.products.length?(i.description=a,i.isAddedSaleDescription=!0):(i.description=s,i.isAddedProductDescription=!0)),i.isAddedSaleDescription&&this.products.length>1?(i.description=s,i.isAddedProductDescription=!0,i.isAddedSaleDescription=!1):i.isAddedProductDescription&&1===this.products.length?(i.description=a,i.isAddedProductDescription=!1,i.isAddedSaleDescription=!0):i.isAddedProductDescription&&(i.description=s),i}get _productModalTpl(){return f`
      <payments-mpos-overview-product-modal
        currency-code="${this.currencyCode}"
        local-currency="${this.localCurrency}"
        language="${this.language}"
        type="${this._productModalType}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${this._isProductModalVisible}"
        .taxTypes="${this.taxTypes}"
        .productData="${this._selectedProduct}"
        @help-modal-close="${()=>this._handleProductModalClose()}"
        @payments-mpos-overview-product-modal-add="${t=>this._handleAddedProduct(t)}"
        @payments-mpos-overview-product-modal-edit="${t=>this._handleEditedProduct(t)}"
      >
      </payments-mpos-overview-product-modal>
    `}get _itemListTpl(){const t=[];return this._totalPrice=0,this._totalIva=0,this._isSameIva=!0,this.products=this.products.map(((e,i)=>{this.products.length!==i+1&&this._isSameIva&&(this._isSameIva=this.products[i+1].iva===e.iva);const a=this._setDefaultDescription(e,i);return this._totalPrice+=a.totalProductPrice,this._totalIva+=a.ivaAmount,t.push(f`
        <payments-mpos-overview-item-action
          amount="${a.unitPrice}"
          currency-code="${this.currencyCode}"
          detail="${this.getIvaText(a.iva)}"
          title-item="${Fi(this.products.length,a.units,a.description)}"
          language="${this.language}"
          local-currency="${this.localCurrency}"
          @payments-mpos-overview-item-action-edit="${()=>this._handleEditProductClick(a,i)}"
          @payments-mpos-overview-item-action-delete="${()=>this._handleDeleteClick(i)}"
        ></payments-mpos-overview-item-action>
        ${this.products.length!==i+1?f`
              <div class="fit">
                <bbva-divider-default></bbva-divider-default>
              </div>
            `:""}
      `),a})),t}get _warningModal(){return f`
      <bbva-help-modal
        aria-label="${this.t(`${this.constructor.is}-last-product-modal`)}"
        body-text="${this.t(`${this.constructor.is}-warning-message`)}"
        button-text="${this.t(`${this.constructor.is}-delete`)}"
        header-text="${this.t(`${this.constructor.is}-warning-header`)}"
        modal-type="caution"
        title-icon="${F()}"
        title-text="${this.t(`${this.constructor.is}-warning-title`)}"
        link-text="${this.t(`${this.constructor.is}-cancel`)}"
        ?visible="${this._isWarningModalVisible}"
        @help-modal-footer-button-click="${()=>this._handleModalButton()}"
        @help-modal-footer-link-click="${()=>this._handleModalLink()}"
        @help-modal-veil-click="${()=>{this._isWarningModalVisible=!1}}"
        @modal-state-change="${t=>t.stopPropagation()}"
      >
      </bbva-help-modal>
    `}render(){return f`
      <div class="container">
        ${this._itemListTpl}
        <payments-mpos-overview-list-simple
          action-accessibility-text="bbva-list-simple-action-help"
          amount="${this._totalPrice}"
          currency-code="${this.currencyCode}"
          local-currency="${this.localCurrency}"
          language="${this.language}"
          label="${this.t(`${this.constructor.is}-total-amount`)}"
        >
        </payments-mpos-overview-list-simple>
        <payments-mpos-overview-item-link
          header-text="${this.t(`${this.constructor.is}-add-product`)}"
          link-icon-left="${w()}"
          @click="${()=>{this._dispatchEvent(`${this.constructor.is}-product-add`)}}"
        >
        </payments-mpos-overview-item-link>
        <div class="continue-button-container">
          <bbva-button-default
            fullwidth
            text="${this.t(`${this.constructor.is}-continue`)}"
            @click="${()=>this._updateMultistepData()}"
          ></bbva-button-default>
        </div>
      </div>
      ${this._warningModal}
    `}}var ns=g`
:host {
  display: block;
  box-sizing: border-box;
  --payments-mpos-overview-panel-detail-padding: 1rem 0 0 0;
  --payments-mpos-overview-panel-detail-description-font-style: auto;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=payments-mpos-overview-list-simple] {
  padding-top: 0;
  padding-bottom: 0;
  --bbva-type-amount-color: ${et("colorPrimarySurfaceContrastFocus",it)};
  --payments-mpos-overview-list-simple-label-text-color: ${et("colorPrimarySurfaceContrastFocus",it)};
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}
[data-tag-name=bbva-help-modal] .confirm-fixed-button {
  padding: 0 1rem;
}
[data-tag-name=bbva-help-modal].multistep-complete {
  --bbva-help-modal--_ambient--full-height-bg-color: ${et("colorSecondarySurfaceAmbientDefault",it)};
}
[data-tag-name=bbva-help-modal]:last-of-type {
  --bbva-help-modal-padding: inherit;
  --bbva-help-modal-title-icon-color: ${et("colorPrimarySurfaceContrastFocus",it)};
}

.comissions-modal {
  --bbva-help-modal-padding: 0 1rem 1rem 1rem;
}

[data-tag-name=bbva-type-text][font-weight] {
  margin-bottom: 0.5rem;
}

.summary__products-wrapper {
  padding-bottom: 1rem;
}
.summary > [data-tag-name=payments-mpos-overview-list-simple] {
  --payments-mpos-overview-list-simple-description-text-font-color: ${et("colorPrimarySurfaceContrastFocus",it)};
  --payments-mpos-overview-list-simple-description-amount-font-weight: ${et("fontWeight50",A)};
}

[data-tag-name=bbva-list-bullet] {
  padding-inline: inherit;
}
[data-tag-name=bbva-list-bullet]:last-of-type {
  padding-bottom: 1.5rem;
}
[data-tag-name=bbva-list-bullet]:first-of-type {
  padding-top: 1.5rem;
}

[data-tag-name=payments-mpos-overview-panel-detail] {
  --payments-mpos-overview-panel-detail-aling: center;
  --payments-mpos-overview-panel-detail-button-bg: ${et("colorSecondaryAltCtaPositiveBackgroundDefault",it)};
  --payments-mpos-overview-panel-detail-button-pressed-bg: ${et("colorSecondaryCtaPositiveBackgroundPressed",it)};
  --payments-mpos-overview-panel-detail-content-amount-amount-padding: 0;
  --payments-mpos-overview-panel-detail-content-amount-text-padding: 0;
}

.content {
  text-align: left;
}

[data-tag-name=bbva-list-bullet] {
  padding-inline: 0;
}

[data-tag-name=bbva-expandable-multistep][all-completed] {
  --bbva-expandable-multistep-height: fit-content;
  --bbva-expandable-multistep--custom--primary-ambient--background-color: inherit;
}
[data-tag-name=bbva-expandable-multistep].link-step-open {
  --bbva-expandable-multistep--custom--primary-ambient--all-completed-background-color: transparent;
}
`,rs=g`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-help-modal-padding: 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.product-modal__container {
  overflow: hidden;
  text-align: initial;
  padding: 0.5rem 1rem;
}
.product-modal__form [data-tag-name*=bbva-form-]:first-child {
  margin-bottom: 0.5rem;
}
.product-modal__form [data-tag-name*=bbva-form-]:not(:last-child):not(:first-child) {
  margin-bottom: 1rem;
}
.product-modal__summary__total {
  --payments-mpos-overview-list-simple-description-amount-font-weight: ${et("fontWeight",y.medium)};
  --payments-mpos-overview-list-simple-label-font-weight: ${et("fontWeight",y.medium)};
  padding: 0;
}
.product-modal__summary__iva {
  margin-top: 1rem;
}
.product-modal__summary__iva > * {
  padding: 0.5rem 0;
}
.product-modal__footer {
  margin-bottom: 1rem;
  padding: 0 1rem;
}
`;const ls="add",ds="edit";class cs extends(D(m(P(_e(_))))){static get is(){return"payments-mpos-overview-product-modal"}static get scopedElements(){const t=[bt,kt,qt,jt,Nt,as];return cs.scopedElementsFromClasses(t)}static get properties(){return{hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},headerTitle:{type:String,attribute:"header-title"},taxTypes:{type:Array,attribute:"iva-options"},language:{type:String},productData:{type:Object,attribute:"product-data"},type:{type:String},visible:{type:Boolean},_description:{type:String},_formTouched:{type:Boolean},_hidePriceMessage:{type:Boolean},_isDescriptionPatternValid:{type:Boolean},_invalidUnits:{type:Boolean},_ivaSelected:{type:String},_priceInputTouched:{type:Boolean},_unitPrice:{type:Number},_units:{type:Number}}}constructor(){super(),this.hasFeatureHeaderHidden=!1,this.headerTitle="",this.taxTypes=[],this.language="",this.productData={},this.type=ls,this.visible=!1,this._description="",this._formTouched=!1,this._hidePriceMessage=!1,this._isDescriptionPatternValid=!1,this._invalidPrice=!1,this._invalidUnits=!1,this._ivaSelected="",this._priceInputTouched=!1,this._unitPrice=0,this._units=1}static get styles(){return[rs,pt.primaryAlt,Ht.primaryAlt,zt.primaryAlt,Ut.primaryAlt,$("payments-mpos-overview-product-modal-shared-styles")]}updated(t){t.forEach(((t,e)=>{"_units"===e&&t!==this[e]&&(this._invalidUnits=Number(this._units)<=0),"visible"===e&&this.visible&&(this._description=this.productData.description??"",this._unitPrice=this.productData.unitPrice??0,this._units=this.productData.units??1,this._ivaSelected=this.productData.iva??this.taxTypes[0],this._invalidPrice=this._unitPrice<=0)}))}_checkPriceValidity(){this._invalidPrice=this._unitPrice<=0||Number.isNaN(this._unitPrice),this._hidePriceMessage=this._invalidPrice}_getTranslation(t){return this.t(`${this.constructor.is}-${t}`)}_handleInputChange(t,e){this[t]=e,this._formTouched=!0}_handleSubmit(){this.productData={...this.productData,description:this._description,unitPrice:this._unitPrice,units:Number(this._units),iva:this._ivaSelected,ivaAmount:Number(this._appliedIva.toFixed(2)),totalProductPrice:this._totalAmount},this._dispatchEvent(`${this.constructor.is}-${this.type}`,this.productData),this._resetProperties()}_resetProperties(){this.productData={},this.visible=!1,this._formTouched=!1,this._hidePriceMessage=!1,this._invalidUnits=!1,this._priceInputTouched=!1}_onDescriptionValidate({detail:{invalid:t}}){this._isDescriptionPatternValid=!t}get _appliedIva(){return this._totalAmount*this._ivaInteger}get _invalidForm(){return this._invalidPrice||this._invalidUnits||!this._formTouched||!this._isDescriptionPatternValid}get _ivaInteger(){return Number.isNaN(Number(this._ivaSelected))?0:this._ivaSelected/100}get _totalAmountNoIva(){return this._totalAmount-this._totalAmount*this._ivaInteger}get _totalAmount(){return this._unitPrice*this._units}get _addModalUnitsTpl(){return this.type===ls?f`
          <bbva-form-input
            allowed-pattern="[0-9]"
            auto-validate
            error-message="${this._getTranslation("units-error")}"
            label="${this._getTranslation("units-optional")}"
            min="1"
            name="_units"
            type="number"
            @input="${t=>{this._handleInputChange("_units",t.composedPath()[0].value||1)}}"
            @form-field-input-clear="${t=>{this._handleInputChange("_units",t.composedPath()[0].value||1)}}"
          ></bbva-form-input>
        `:""}get _amountInputTpl(){return f`
      <bbva-form-input
        amount="${this._unitPrice}"
        currency-code="${this.currencyCode}"
        error-message="${this._getTranslation("price-error")}"
        id="amount-input"
        info-message="${this._hidePriceMessage?"":this._getTranslation("unit-price")}"
        label="${this._getTranslation("iva-amount")}"
        language="${this.language}"
        local-currency="${this.localCurrency}"
        maxlength="10"
        decimal-digits="3"
        pattern="^(-?,?.*[1-9])\\d*\\.?,?\\d*$"
        required
        type="amount"
        validate-on-blur
        ?auto-validate="${this._priceInputTouched}"
        @form-amount-input-change="${t=>{if(this._priceInputTouched){const e=t.detail.value?t.detail.amount:0;this._handleInputChange("_unitPrice",e),this._checkPriceValidity()}}}"
        @form-field-input-blur="${()=>{this._checkPriceValidity()}}"
        @form-field-input-focus="${()=>{this._priceInputTouched=!0}}"
        @form-field-input-clear="${()=>{this._unitPrice=0}}"
      >
      </bbva-form-input>
    `}get _editModalUnitsTpl(){return this.type===ds?f`
          <bbva-form-input
            allowed-pattern="[0-9]"
            auto-validate
            error-message="${this._getTranslation("units-error")}"
            label="${this._getTranslation("units")}"
            min="1"
            name="_units"
            required
            type="number"
            value="${this._units}"
            @input="${t=>{this._handleInputChange("_units",t.composedPath()[0].value)}}"
            @form-field-input-clear="${t=>{this._handleInputChange("_units",t.composedPath()[0].value)}}"
          ></bbva-form-input>
        `:""}get _formTpl(){return f`
      <form ambient="primary-alt" class="product-modal__form">
        ${this._amountInputTpl} ${this._addModalUnitsTpl} ${this._editModalUnitsTpl}
        <bbva-form-input
          auto-validate
          error-message="${this.t(`${Fe}-no-emojis-allowed`)}"
          type="text"
          optional-label="${this._getTranslation("product-description")}"
          maxlength="250"
          pattern=${Ci}
          value="${this._description}"
          @input="${t=>this._handleInputChange("_description",t.composedPath()[0].value)}"
          @form-field-input-clear="${t=>{this._handleInputChange("_description",t.composedPath()[0].value)}}"
          @form-field-input-validate="${this._onDescriptionValidate}"
        >
        </bbva-form-input>
        <bbva-form-select
          label="${this._getTranslation("applied-iva")}"
          name="_ivaSelected"
          required
          @change="${t=>this._handleInputChange("_ivaSelected",t.target.value)}"
        >
          ${this.taxTypes.map((t=>f`
              <bbva-form-option value="${t}" ?selected="${this._ivaSelected===t}">
                ${Number.isNaN(Number(t))?this._getTranslation(t.toLowerCase()):`${t}%`}
              </bbva-form-option>
            `))}
        </bbva-form-select>
      </form>
    `}get _summaryTpl(){return f`
      <div class="product-modal__summary">
        <div class="product-modal__summary">
          <payments-mpos-overview-list-simple
            class="product-modal__summary__total"
            amount="${this._totalAmount}"
            currency-code="${this.currencyCode}"
            label="${this._getTranslation("total-amount")}"
            language="${this.language}"
            local-currency="${this.localCurrency}"
            show-value-zero
          >
          </payments-mpos-overview-list-simple>
        </div>
        ${this._ivaInteger>0?f`
              <div class="product-modal__summary__iva">
                <payments-mpos-overview-list-simple
                  amount="${this._totalAmountNoIva}"
                  currency-code="${this.currencyCode}"
                  label="${this._getTranslation("subtotal-amount")}"
                  language="${this.language}"
                  local-currency="${this.localCurrency}"
                >
                </payments-mpos-overview-list-simple>
                <payments-mpos-overview-list-simple
                  amount="${this._appliedIva}"
                  currency-code="${this.currencyCode}"
                  label="${`${this._getTranslation("iva")} ${this._ivaSelected}%`}"
                  language="${this.language}"
                  local-currency="${this.localCurrency}"
                >
                </payments-mpos-overview-list-simple>
              </div>
            `:f``}
      </div>
    `}get _footerTpl(){return f`
      <div class="product-modal__footer" slot="slot-footer">
        <bbva-button-default
          fullwidth
          text="${this._getTranslation("save")}"
          ?disabled="${this._invalidForm}"
          @click="${this._handleSubmit}"
        >
        </bbva-button-default>
      </div>
    `}render(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this._getTranslation("close-modal")}"
        aria-label="${this._getTranslation("")}"
        header-text="${this.hasFeatureHeaderHidden?"":this.headerTitle||this._getTranslation(this.type)}"
        hide-content-padding-top
        fixed-footer
        full-height
        ?visible="${this.visible}"
      >
        <div class="content" slot="slot-content">
          <div class="product-modal__container">
            <div class="product-modal__main">${this._formTpl} ${this._summaryTpl}</div>
          </div>
        </div>
        ${this._footerTpl}
      </bbva-help-modal>
    `}}const hs={add:"add",edit:"edit"},ps=["step-1","step-2"],ms=["step-1","step-2","step-3"];class us extends(H(D(m(P(la(_e(na(_)))))))){static get is(){return"payments-mpos-overview-multistep"}static get properties(){return{chargeMethods:{type:Array,attribute:"charge-methods"},commission:{type:Number},expirationDays:{type:Number,attribute:"expiration-days"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},taxTypes:{type:Array,attribute:"iva-options"},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},productList:{type:Array,attribute:"product-list"},shouldChangeChargeMethod:{type:Boolean,attribute:"should-change-charge-method"},visible:{type:Boolean},_dataStore:{type:Object},_isLinkStepOpen:{type:Boolean},_isProductModalVisible:{type:Boolean},_isSummaryStepOpen:{type:Boolean},_isWarningModalVisible:{type:Boolean},_openComissionModal:{type:Boolean},_showConfirmButton:{type:Boolean},_showSecondStepDivider:{type:Boolean},_stepPayload:{type:Object},_stepsFlow:{type:Array},_totalPrice:{type:Number},_totalSteps:{type:Number}}}constructor(){super(),this.chargeMethods=[],this.commission=0,this.expirationDays=0,this.hasFeatureHeaderHidden=!1,this.iOSFixedHeader=!1,this.productList=[],this.shouldChangeChargeMethod=!1,this.taxTypes=[],this.visible=!1,this._dataStore={},this._productModalType="",this._isLinkStepOpen=!1,this._isProductModalVisible=!1,this._isSameIva=!1,this._isSummaryStepOpen=!1,this._isWarningModalVisible=!1,this._openComissionModal=!1,this._selectedProduct={},this._selectedMethod=ni.PRESENT_CARD.id,this._showConfirmButton=!1,this._showSecondStepDivider=!1,this._stepPayload={},this._stepsFlow=ps,this._totalIvaAmount=0,this._totalPrice=0,this._totalSteps=2}static get scopedElements(){const t=[At,Vt,St,kt,Bt,dt,Na,Ja,Ka,os,as,Fa,cs];return us.scopedElementsFromClasses(t)}static get styles(){return[ns,It.primaryAlt,st.primaryAlt,is.secondary,is.primary,$(`${us.is}-shared-styles`)]}firstUpdated(){super.firstUpdated(),this.visible=!0,this._persistStepData("products",this.productList),this._persistStepData("summaryStepProducts",this.productList)}updated(t){t.forEach((async(t,e)=>{"shouldChangeChargeMethod"===e&&t!==this[e]&&this[e]&&this._openStep(2),"visible"===e&&(this.visible?()=>{this.addView(this),this._commssionTranslationsOptions()}:()=>this.closeView(this))(),"_showConfirmButton"===e&&this[e]&&this._dispatchEvent(`${this.constructor.is}-action-step-load`,{process:this._selectedMethod,step:3}),"_stepPayload"===e&&Object.keys(this._stepPayload).length&&this._dispatchEvent(`${this.constructor.is}-action-step-load`,this._stepPayload)}))}get _headerType(){return"modal-initial"+(this._isSummaryStepOpen?"":"-secondary")}_navigateBack(){this._openComissionModal?this._openComissionModal=!1:this._isWarningModalVisible=!this._isWarningModalVisible}_goToNextStep(t){const e=t.composedPath()[0];e.dispatchEvent(new CustomEvent("complete",{bubbles:!0})),this._currentTarget=e}_getDataStoreEntry(t){return this._dataStore[t]}_persistStepData(t,e){this._dataStore={...this._dataStore,[t]:e}}_handleStepMethod(t){t.detail===ni.PAYMENT_LINK.id?(this._isLinkStepOpen=!0,this._stepsFlow=ms,this._selectedMethod=t.detail,this._dispatchEvent(`${this.constructor.is}-step-payment-link-load`,"name"),this._totalSteps=3):(this._stepsFlow=ps,this._selectedMethod=t.detail,this._totalSteps=2),this._showSecondStepDivider=this._stepsFlow.length>2,this._goToNextStep(t)}_handleStepLink(t){const{name:e,email:i}=t.detail;this._persistStepData("name",e),this._persistStepData("email",i),this._goToNextStep(t),this._isLinkStepOpen=!1}_onMultistepComplete(){this._dispatchEvent(`${this.constructor.is}-complete`,{expirationDays:this.expirationDays,paymentMethod:this._selectedMethod,products:this._getDataStoreEntry("products"),totalPrice:this._totalPrice,iva:this._isSameIva?this._getDataStoreEntry("products")[0].iva:"INCLUDED",ivaAmount:this._totalIvaAmount,...this._selectedMethod===ni.PAYMENT_LINK.id&&{customer:{email:this._getDataStoreEntry("email"),name:this._getDataStoreEntry("name")}}})}_openStep(t){this.shadowRoot.querySelector(`#step-${t}`).edit(),this._dispatchEvent(`${this.constructor.is}-charge-method-change`)}_getPanelDescription(){const t=[{text:this.t(`${this.constructor.is}-comission`),amount:this.commission*this._totalPrice,additionalText:this.t(`${this.constructor.is}-commission-van`),iconActive:!0}];return this._totalIvaAmount&&t.unshift({amount:this._totalIvaAmount,text:this._isSameIva?this.getIvaText(this._getDataStoreEntry("products")[0].iva):this.t(`${this.constructor.is}-included-iva`)}),t}_handleProductModalClose(){this._isProductModalVisible=!1,this._selectedProduct={}}_handleAddedProduct(t){const e=t.detail,i=[...this._getDataStoreEntry("summaryStepProducts"),e];this._persistStepData("summaryStepProducts",i),this._isProductModalVisible=!1}_handleEditedProduct(t){const e=t.detail,i=this._getDataStoreEntry("summaryStepProducts");this._selectedProduct={},this._isProductModalVisible=!1;const a=e.description===i[e.index].description;e.isAddedSaleDescription&&(e.isAddedSaleDescription=a),e.isAddedProductDescription&&(e.isAddedProductDescription=a),i[e.index]=e,this._persistStepData("summaryStepProducts",[...i])}_handleOpenProductsModal(t){this._productModalType=hs[t],this._isProductModalVisible=!0}_handleRemoveProduct(t){const{productIndex:e}=t.detail,i=this._getDataStoreEntry("summaryStepProducts");i.splice(e,1);const a=[...i];this._persistStepData("summaryStepProducts",a)}_handleUpdateSummaryData(t){const{products:e,totalPrice:i,totalIva:a,isSameIva:s}=t.detail;this._stepPayload={typology:`${e.reduce(((t,e)=>t+e.units),0)}`,amount:i,currency:this.currencyCode,step:2},this._persistStepData("products",e),this.productList=e,this._totalPrice=i,this._totalIvaAmount=a,this._isSameIva=s,this._isSummaryStepOpen=!1,this._goToNextStep(t)}_commssionTranslationsOptions(){const t={br:"<br>"},e=(t,e)=>this.t(`${this.constructor.is}-${t}`,e),i=(t,i)=>e(`commissions-modal-${t}`,i);this.commissionModalContent={primaryContent:{description:e("commissions-modal-primary-description"),list:[i("primary-list-1",{commission:100*this.commission}),i("primary-list-2"),i("primary-list-3")]},secondaryContent:{title:e("commissions-modal-secondary-title"),description:e("commissions-modal-secondary-description"),list:[i("secondary-list-1"),i("secondary-list-2",t),i("secondary-list-3",t),i("secondary-list-4",t),i("secondary-list-5",t)]}}}get _primaryListTpl(){return this.commissionModalContent.primaryContent.list.map((t=>f`<bbva-list-bullet text="${t}"></bbva-list-bullet>`))}get _secondaryListTpl(){return this.commissionModalContent.secondaryContent.list.map((t=>f`<bbva-type-text text="${t}"></bbva-type-text>`))}get _primaryContentTpl(){return Object.keys(this.commissionModalContent.primaryContent).length?f`
            <bbva-type-text unset text="${this.commissionModalContent.primaryContent.description}"></bbva-type-text>
            ${this._primaryListTpl}`:f``}get _secondaryContentTpl(){return Object.keys(this.commissionModalContent.secondaryContent).length?f`<bbva-type-text font-weight="500" unset text="${this.commissionModalContent.secondaryContent.title}"></bbva-type-text><bbva-type-text unset text="${this.commissionModalContent.secondaryContent.description}"></bbva-type-text>${this._secondaryListTpl}`:f``}get _productModalTpl(){return f`
      <payments-mpos-overview-product-modal
        currency-code="${this.currencyCode}"
        local-currency="${this.localCurrency}"
        language="${this.language}"
        type="${this._productModalType}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${this._isProductModalVisible}"
        .taxTypes="${this.taxTypes}"
        .productData="${this._selectedProduct}"
        @help-modal-close="${()=>this._handleProductModalClose()}"
        @payments-mpos-overview-product-modal-add="${t=>this._handleAddedProduct(t)}"
        @payments-mpos-overview-product-modal-edit="${t=>this._handleEditedProduct(t)}"
      >
      </payments-mpos-overview-product-modal>
    `}get _warningModalTpl(){return f`
      <bbva-help-modal
        aria-label="${this.t(`${this.constructor.is}-warning-modal`)}"
        body-text="${this.t(`${this.constructor.is}-warning-message`)}"
        button-text="${this.t(`${this.constructor.is}-quit`)}"
        header-text="${this.t(`${this.constructor.is}-warning-header`)}"
        modal-type="caution"
        title-icon="${N()}"
        title-text="${this.t(`${this.constructor.is}-warning-title`)}"
        link-text="${this.t(`${this.constructor.is}-cancel`)}"
        ?visible="${this._isWarningModalVisible}"
        @help-modal-close="${t=>{t.stopPropagation(),this._isWarningModalVisible=!1}}"
        @help-modal-footer-button-click="${t=>{t.stopPropagation(),this._isWarningModalVisible=!1,this.visible=!1,this._dispatchEvent(`${this.constructor.is}-close`)}}"
        @help-modal-footer-link-click="${t=>{t.stopPropagation(),this._isWarningModalVisible=!1}}"
        @modal-state-change="${t=>t.stopPropagation()}"
      >
      </bbva-help-modal>
    `}get _commissionsModalTpl(){return f`
      <bbva-help-modal
      class="comissions-modal"
      header-close-icon-aria-label="${this.t(`${this.constructor.is}-close`)}"
      fixed-footer
      full-height
      header-text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-help`)}"
      title-icon="${E()}"
      title-text="${this.t(`${this.constructor.is}-commissions-modal-title`)}"
      ?visible="${this._openComissionModal}"
      @help-modal-close="${t=>{t.stopPropagation(),this._openComissionModal=!1}}"
      >
      <div slot="slot-content" tabindex="0">
        ${this.commissionModalContent?f`${this._primaryContentTpl} ${this._secondaryContentTpl}`:""}
      </div>
      </bbva-help-modal>
    `}get _summaryProductsTpl(){var t;return null===(t=this._getDataStoreEntry("products"))||void 0===t?void 0:t.map((({description:t,iva:e,unitPrice:i,units:a})=>f`
        <div class="summary__products-wrapper">
          <payments-mpos-overview-list-simple
            amount="${i}"
            currency-code="${this.currencyCode}"
            label="${Fi(this.productList.length,a,this.t(t))}"
            label-ellipsis
            language="${this.language}"
            local-currency="${this.localCurrency}"
          >
          </payments-mpos-overview-list-simple>
          ${"NA"!==e?f`
                <payments-mpos-overview-list-simple label="${this.getIvaText(e)}" label-ellipsis>
                </payments-mpos-overview-list-simple>
              `:""}
        </div>
      `))}render(){return f`
      <bbva-help-modal
        class="${L({"multistep-complete":this._showConfirmButton})}"
        full-height
        fixed-footer
        hide-content-padding-top
        header-text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}`)}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible="${this.visible}"
      >
        <div slot="slot-header">
          <bbva-header-main
            close-icon-aria-label="${this.t(`${this.constructor.is}-close`)}"
            variant="${this._headerType}"
            text="${this.t(`${this.constructor.is}-header-text`)}"
            @header-main-icon-click="${t=>{t.stopPropagation(),this._isWarningModalVisible=!0}}"
          >
          </bbva-header-main>
        </div>
        <div slot="slot-content">
          <div class="lighter-wrapper main-content-wrapper">
            <bbva-expandable-multistep
              class="${L({"link-step-open":this._isLinkStepOpen})}"
              .activeSteps="${this._stepsFlow}"
              @expandable-multistep-all-complete="${t=>{this._showConfirmButton=t.detail}}"
            >
              <div slot="content">
                <bbva-expandable-step
                  id="step-1"
                  class="animation"
                  completed
                  data-selector="step"
                  header="${this.t(`${this.constructor.is}-products-summary`)}"
                  hide-padding-left
                  hide-padding-right
                  hide-padding-top
                  show-link
                  step="0"
                  total-steps="${this._totalSteps}"
                  .currentStepLabel="${this.t(`${this.constructor.is}-step`,{currentStep:1,totalSteps:this._totalSteps})}"
                  .editLabel="${this.t(`${this.constructor.is}-modify`)}"
                  @expandable-step-edit-step="${()=>{this._isSummaryStepOpen=!0}}"
                >
                  <div class="content">
                    <payments-mpos-overview-step-summary
                      currency-code="${this.currencyCode}"
                      language="${this.language}"
                      local-currency="${this.localCurrency}"
                      .products="${this._getDataStoreEntry("summaryStepProducts")}"
                      @payments-mpos-overview-step-summary-data-update="${this._handleUpdateSummaryData}"
                      @payments-mpos-overview-step-summary-product-edit="${t=>{const{product:e}=t.detail;this._selectedProduct={...e},this._handleOpenProductsModal(hs.edit)}}"
                      @payments-mpos-overview-step-summary-product-add="${()=>this._handleOpenProductsModal(hs.add)}"
                      @payments-mpos-overview-step-summary-product-remove="${this._handleRemoveProduct}"
                    >
                    </payments-mpos-overview-step-summary>
                  </div>
                  <div class="summary" slot="summary">
                    ${this._summaryProductsTpl}
                    <payments-mpos-overview-list-simple
                      ambient="secondary"
                      amount="${this._totalPrice}"
                      currency-code="${this.currencyCode}"
                      language="${this.language}"
                      local-currency="${this.localCurrency}"
                      label="${this.t(`${this.constructor.is}-total`)}"
                      label-ellipsis
                    >
                    </payments-mpos-overview-list-simple>
                  </div>
                </bbva-expandable-step>
                <bbva-expandable-step
                  id="step-2"
                  class="animation"
                  data-selector="step"
                  header="${this.t(`${this.constructor.is}-charge-method`)}"
                  hide-padding-left
                  hide-padding-right
                  hide-padding-top
                  is-dynamic-handler
                  show-link
                  step="1"
                  total-steps="${this._totalSteps}"
                  ?hide-divider="${!this._showSecondStepDivider}"
                  .currentStepLabel="${this.t(`${this.constructor.is}-step`,{currentStep:2,totalSteps:this._totalSteps})}"
                  .editLabel="${this.t(`${this.constructor.is}-modify`)}"
                  @expandable-step-edit-step="${()=>{this._dispatchEvent(`${this.constructor.is}-action-step-load`,this._stepPayload)}}"
                  @payments-mpos-overview-step-charge-methods-method-select="${this._handleStepMethod}"
                >
                  <div class="content">
                    <payments-mpos-overview-step-charge-methods
                      .chargeMethods="${this.chargeMethods}"
                    ></payments-mpos-overview-step-charge-methods>
                  </div>
                  <div class="summary" slot="summary">
                    <payments-mpos-overview-list-simple
                      label="${this.t(`${this.constructor.is}-${this._selectedMethod.toLowerCase()}`)}"
                    ></payments-mpos-overview-list-simple>
                  </div>
                </bbva-expandable-step>
                <bbva-expandable-step
                  id="step-3"
                  class="animation"
                  data-selector="step"
                  header="${this.t(`${this.constructor.is}-request-data`)}"
                  hide-divider
                  hide-padding-left
                  hide-padding-right
                  hide-padding-top
                  show-link
                  step="2"
                  total-steps="${this._totalSteps}"
                  .currentStepLabel="${this.t(`${this.constructor.is}-step`,{currentStep:3,totalSteps:this._totalSteps})}"
                  .editLabel="${this.t(`${this.constructor.is}-modify`)}"
                  @payments-mpos-overview-step-payment-link-mailto="${this._handleStepLink}"
                >
                  <div class="content">
                    <payments-mpos-overview-step-payment-link
                      expiration-days="${this.expirationDays}"
                    ></payments-mpos-overview-step-payment-link>
                  </div>
                  <div class="summary" slot="summary">
                    <payments-mpos-overview-list-simple
                      label="${this.t(`${this.constructor.is}-name`)}"
                      label-ellipsis
                      description="${this._getDataStoreEntry("name")}"
                    ></payments-mpos-overview-list-simple>
                    <payments-mpos-overview-list-simple
                      description-ellipsis
                      label="${this.t(`${this.constructor.is}-email`)}"
                      label-ellipsis
                      description="${this._getDataStoreEntry("email")}"
                    ></payments-mpos-overview-list-simple>
                  </div>
                </bbva-expandable-step>
              </div>
              <div slot="confirmation"></div>
            </bbva-expandable-multistep>
          </div>
        </div>
        <div slot="slot-footer">
          <div class="confirm-fixed-button" ?hidden="${!this._showConfirmButton}">
            <payments-mpos-overview-panel-detail
              amount="${this._totalPrice}"
              badge-aria-label="${this.t(`${this.constructor.is}-help`)}"
              currency-code="${this.currencyCode}"
              language="${this.language}"
              local-currency="${this.localCurrency}"
              text-amount="${this.t(`${this.constructor.is}-receivables`)}"
              text-button="${this.t(`${this.constructor.is}-confirm`)}"
              .description="${this._getPanelDescription()}"
              @payments-mpos-overview-panel-detail-help-click="${()=>{this._openComissionModal=!0}}"
              @payments-mpos-overview-panel-detail-action-click="${this._onMultistepComplete}"
            >
            </payments-mpos-overview-panel-detail>
          </div>
        </div>
      </bbva-help-modal>
      ${this._commissionsModalTpl} ${this._warningModalTpl} ${this._productModalTpl}
    `}}var vs=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.no-top-padding {
  padding-top: 0;
}

[data-tag-name=payments-mpos-overview-list-simple] {
  --payments-mpos-overview-list-simple-description-text-font-weight: ${et("fontWeight",y.medium)};
  --payments-mpos-overview-list-simple-description-amount-font-weight: ${et("fontWeight",y.medium)};
}
`;const gs="summary",bs="operation",ys="sendDate",_s="refundDate";class $s extends(D(P(m(Qi(la(_)))))){static get is(){return"payments-mpos-overview-voucher-data"}static get scopedElements(){const t=[as];return $s.scopedElementsFromClasses(t)}static get styles(){return[vs,$(`${$s.is}-shared-styles`)]}static get properties(){return{commission:{type:Number},date:{type:String},dateFormatOptions:{type:Object,attribute:"date-format-options"},isLink:{type:Boolean,attribute:"is-link"},isRefund:{type:Boolean,attribute:"is-refund"},voucherData:{type:Object,attribute:"voucher-data"}}}constructor(){super(),this.commission=0,this.date="",this.dateFormatOptions={},this.isLink=!1,this.isRefund=!1,this.voucherData={}}_formattedProductsDetailFromReceipt(t){return t.flatMap((e=>{const i=`${e.description} ${t.length>1?`(${e.units})`:""}`,a=t.length>1?`${String.fromCharCode(160)}${this._getTranslation("unit")}`:"",s=t.length<=1?e.totalProductPrice:e.unitPrice;return[{amountDescription:a,amount:s,detail:this.getIvaText(e.iva),label:i,value:s}]}))}_getFormattedCommission(t){return this.commission*(t.amount||t.totalPrice)}_getMonetarySummary(t){const e=t.products?this._formattedProductsDetailFromReceipt(t.products):[];return[...this.isLink||this.isRefund?[...e,{label:this._getTranslation("total-amount"),amount:t.totalPrice||t.amount},this._getIVA(t)]:e,{label:this._getTranslation("commission"),amount:this._getFormattedCommission(t),amountDescription:this._getTranslation("commission-van")}]}_getDatesCardReader(t){return[{label:this._getTranslation("operation-date"),value:Ei(t.creationDate,this.language,xe)},{label:this._getTranslation("operation-time"),value:Ei(t.creationDate,this.language,Te)}]}_getIVA(t){var e;const i=Number((null===(e=t.fee)||void 0===e?void 0:e.amount)??(t.ivaAmount?t.ivaAmount:t.iva)),a=t.iva&&t.ivaAmount?t.iva:"INCLUDED";return Number.isNaN(i)?"":{label:this.getIvaText(a),amount:i}}_getOperationCardReader(t){var e,i,a;const{card:s,payment_method_name:o,paymentMethod:n}=t;return[{label:this._getTranslation("merchant"),value:null===(e=this.getSelectedMerchant())||void 0===e?void 0:e.name},{label:this._getTranslation("id"),value:null===(i=this.getSelectedMerchant())||void 0===i?void 0:i.id},{label:this._getTranslation("charge-method"),value:this._getTranslation((null==o?void 0:o.toLowerCase())||(null==n?void 0:n.toLowerCase()))},...t.paymentPlan?[{label:this._getTranslation("interest-free-label"),value:this._getTranslation("interest-free-value",t.paymentPlan)}]:[],..."TAP_ON_PHONE"!==o?[{label:this._getTranslation("charging-device"),value:null===(a=this.getSelectedMerchant())||void 0===a?void 0:a.cardReaderDevice.name}]:[],{label:this._getTranslation("service-operator"),value:this._getTranslation("openpay")},{label:this._getTranslation("issuer"),value:(null==s?void 0:s.bank_name)||t.bankName},{label:this._getTranslation("payment-method"),value:`${this._getTranslation("card")} ${(null==s?void 0:s.brand)||t.brand} ${this._getTranslation((null==s?void 0:s.type)||t.type)}`},{label:this._getTranslation("card-number"),value:v((null==s?void 0:s.card_number)||(null==t?void 0:t.cardNumber),"•",!0,"4"),isObfuscate:!0},{label:this._getTranslation("auth-number"),value:t.authorization||t.authNumber},{label:this._getTranslation("operation-id"),value:t.id}]}_getOperationLink(t){var e,i,a,s;return[{label:this._getTranslation("merchant"),value:null===(e=this.getSelectedMerchant())||void 0===e?void 0:e.name},{label:this._getTranslation("id"),value:null===(i=this.getSelectedMerchant())||void 0===i?void 0:i.id},{label:this._getTranslation("charge-method"),value:this._getTranslation("link")},{label:this._getTranslation("service-operator"),value:this._getTranslation("openpay")},{label:this._getTranslation("name"),value:null===(a=t.customer)||void 0===a?void 0:a.name},{label:this._getTranslation("email"),value:null===(s=t.customer)||void 0===s?void 0:s.email,isObfuscate:!0}]}_getPaymentDateLink(t){return[{label:this._getTranslation("send-date"),value:Ei(t.creationDate,this.language,xe)},{label:this._getTranslation("send-time"),value:Ei(t.creationDate,this.language,Te)},{label:this._getTranslation("operation-date"),value:Ei(t.operationDate,this.language,xe)},{label:this._getTranslation("operation-time"),value:Ei(t.operationDate,this.language,Te)},{label:this._getTranslation("operation-id"),value:t.id}]}_getSendDateLink(t){return[{label:this._getTranslation("send-date"),value:Ei(t.creationDate,this.language,xe)},{label:this._getTranslation("send-time"),value:Ei(t.creationDate,this.language,Te)},{label:this._getTranslation("expiration-date"),value:Ei(t.expirationDate,this.language,xe)},{label:this._getTranslation("operation-id"),value:t.id}]}_getRefundDate(t){var e,i;return[{label:this._getTranslation("date"),value:Ei(t.operationDate??(null===(e=t.transaction)||void 0===e?void 0:e.creationDate),this.language,xe)},{label:this._getTranslation("time"),value:Ei(t.operationDate??(null===(i=t.transaction)||void 0===i?void 0:i.creationDate),this.language,Te)}]}_generateVoucherData(){return this.isLink?this._mapperLinkVoucher(this.voucherData):this._mapperCardReaderVoucher(this.voucherData)}_getTranslation(t,e){return this.t(`${this.constructor.is}-${t}`,{param:e})}_mapperCardReaderVoucher(t){const e={[_s]:this._getRefundDate.bind(this)},i=this.isRefund?_s:"";return{fields:{[gs]:this._getMonetarySummary(t),[bs]:[...this._getOperationCardReader(t),...e[i]?e[i](t):[]]}}}_mapperLinkVoucher(t){const e={[ys]:this._getSendDateLink.bind(this),[_s]:this._getRefundDate.bind(this)},i=this.isRefund?_s:ys;return{fields:{[gs]:this._getMonetarySummary(t),[bs]:[...this._getOperationLink(t),...e[i](t)]}}}get _dateTpl(){return f`
      <payments-mpos-overview-list-simple
        date="${this.date}"
        label="${this._getTranslation("date")}"
        label-ellipsis
        language="${this.language}"
        local-currency="${this.voucherData.currency||this.currencyCode}"
        .options="${this.dateFormatOptions}"
      >
      </payments-mpos-overview-list-simple>
    `}get _monetarySummaryTpl(){const{fields:{summary:t}}=this._generateVoucherData();return f`
      <div class="products-summary__wrapper">
        ${null==t?void 0:t.map((({amount:t,amountDescription:e,detail:i,label:a,value:s})=>s||t?f`
                ${i?f`
                      <payments-mpos-overview-list-simple
                        amount="${M(t)}"
                        amount-description="${M(e)}"
                        currency-code="${this.voucherData.currency||this.currencyCode}"
                        label="${a}"
                        label-ellipsis
                        language="${this.language}"
                        local-currency="${this.voucherData.currency||this.currencyCode}"
                      >
                      </payments-mpos-overview-list-simple>
                      <payments-mpos-overview-list-simple
                        class="no-top-padding"
                        label="${i}"
                        label-ellipsis
                        language="${this.language}"
                      >
                      </payments-mpos-overview-list-simple>
                    `:f`
                      <payments-mpos-overview-list-simple
                        amount="${M(t)}"
                        amount-description="${M(e)}"
                        currency-code="${this.voucherData.currency||this.currencyCode}"
                        label="${a}"
                        label-ellipsis
                        language="${this.language}"
                        local-currency="${this.voucherData.currency||this.currencyCode}"
                      >
                      </payments-mpos-overview-list-simple>
                    `}
              `:""))}
      </div>
    `}get _operationSummaryTpl(){const{fields:{operation:t}}=this._generateVoucherData();return f`
      ${null==t?void 0:t.map((({label:t,value:e,isObfuscate:i})=>e?f`
              <payments-mpos-overview-list-simple
                description="${M(e)}"
                description-ellipsis
                label="${t}"
                label-ellipsis
                ?data-acoustic-obfuscate="${i}"
              >
              </payments-mpos-overview-list-simple>
            `:""))}
    `}render(){return f`
      ${this.date?this._dateTpl:""}${this._monetarySummaryTpl} ${this._operationSummaryTpl}
    `}}var fs=g`
:host {
  display: block;
  box-sizing: border-box;
  position: relative;
  overflow: hidden;
  margin-top: 0;
  --_payments-mpos-overview-panel-info-content-panel-background-color: var(--payments-mpos-overview-dark-mode-panel-info-content-panel-background-color, var(--payments-mpos-overview-panel-info-content-panel-background-color, inherit));
  --_payments-mpos-overview-panel-info-content-panel-color: var(--payments-mpos-overview-dark-mode-panel-info-content-panel-color, var(--payments-mpos-overview-panel-info-content-panel-color, inherit));
  --_payments-mpos-overview-panel-info-content-panel-box-shadow: var(--payments-mpos-overview-panel-info-content-panel-box-shadow,0 1px 3px 0 rgba(18, 18, 18, 0.2));
  --_payments-mpos-overview-panel-info-skeleton-color: var(--payments-mpos-overview-dark-mode-panel-info-skeleton-color, var(--payments-mpos-overview-panel-info-skeleton-color, ${et("colorPrimarySurfaceAlternativePreloading",it)}));
  --_payments-mpos-overview-panel-info-skeleton-bg: var(--payments-mpos-overview-dark-mode-panel-info-skeleton-bg, var(--payments-mpos-overview-panel-info-skeleton-bg, transparent));
  --_payments-mpos-overview-panel-info-padding-bottom: var(--payments-mpos-overview-panel-info-padding-bottom, rem(16px));
  --_payments-mpos-overview-panel-info-padding-content-text: var(--payments-mpos-overview-panel-info-padding-content-text, rem(12px));
  --_payments-mpos-overview-panel-info-content-panel-padding: var(--payments-mpos-overview-panel-info-content-panel-padding, 0);
  --_payments-mpos-overview-panel-info-margin-content-text: var(--payments-mpos-overview-panel-info-margin-content-text, 0);
  --_payments-mpos-overview-panel-info-title-margin: var(--payments-mpos-overview-panel-info-title-margin, 1rem 0 0);
  --_payments-mpos-overview-panel-info-description-margin: var(--payments-mpos-overview-panel-info-description-margin, 0);
  --_payments-mpos-overview-panel-info-description-padding: var(--payments-mpos-overview-panel-info-description-padding, 0.5rem 0);
  --_payments-mpos-overview-panel-info-skeleton-animated-layer-bg: var(--payments-mpos-overview-dark-mode-panel-info-skeleton-animated-layer-bg, var(--payments-mpos-overview-panel-info-skeleton-animated-layer-bg, ${et("colorPrimarySurfaceAmbientPressed",it)}));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.content-panel {
  background-color: var(--_payments-mpos-overview-panel-info-content-panel-background-color);
  box-shadow: var(--_payments-mpos-overview-panel-info-content-panel-box-shadow);
  box-sizing: border-box;
  text-align: left;
  color: var(--_payments-mpos-overview-panel-info-content-panel-color);
  padding: var(--_payments-mpos-overview-panel-info-content-panel-padding);
}

:host(:not([full-height])[data-dag-name=bbva-help-modal]) .content-panel {
  margin-bottom: 2rem;
}

.description-content {
  font-style: ${et("fontStyle",y.book)};
  font-weight: ${et("fontWeight",y.book)};
  font-size: ${et("typeSmall",T)};
  margin: var(--_payments-mpos-overview-panel-info-description-margin);
  padding: var(--_payments-mpos-overview-panel-info-description-padding);
}

.content-text {
  margin: var(--_payments-mpos-overview-panel-info-margin-content-text);
  padding: var(--_payments-mpos-overview-panel-info-padding-content-text);
  font-style: ${et("fontStyle",y.book)};
  font-weight: ${et("fontWeight",y.book)};
  font-size: ${et("typeSmall",T)};
}
.content-text .title {
  font-style: ${et("fontStyle",y.medium)};
  font-weight: ${et("fontWeight",y.medium)};
  margin: var(--_payments-mpos-overview-panel-info-title-margin);
}
.content-text [data-tag-name=bbva-type-link] {
  padding: 0.5rem 0 0;
}

[data-tag-name=bbva-badge-default] {
  display: inline-block;
}

[data-tag-name=bbva-type-icon] {
  --bbva-type-icon--_ambient--color: ${et("colorSecondaryAltCtaNegativeBackgroundDefault",it)};
}

:host([loading]) {
  position: relative;
  height: var(--_payments-mpos-overview-panel-info-skeleton-height, 13rem);
  pointer-events: none;
  background-repeat: no-repeat;
  background-image: linear-gradient(var(--_payments-mpos-overview-panel-info-skeleton-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-panel-info-skeleton-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-panel-info-skeleton-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-panel-info-skeleton-color) 50%);
  background-color: var(--_payments-mpos-overview-panel-info-skeleton-bg);
  background-size: 72px 72px, calc((65% * 2) + (16px/ 2)) 16px, calc((85% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px;
  background-position: 50% 24px, -50% 112px, -10% 144px, -22% 168px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: var(--_payments-mpos-overview-panel-info-skeleton-height, 13rem);
  background: var(--_payments-mpos-overview-panel-info-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

.content-panel .content-image .microillustration {
  padding-bottom: var(--_payments-mpos-overview-panel-info-padding-bottom);
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
`;const ks={light:g`
    ${vt.primaryAlt}
    ${Ct.primaryAlt}
    ${ut.primaryAlt}
    ${st.primaryAlt}
    ${ot.primaryAlt}
  `,dark:g`
    ${vt.secondary}
    ${Ct.secondary}
    ${ut.primary}
    ${ut.primary}
    ${st.primary}
    ${ot.primary}
  `};class ws extends(D(_)){static get is(){return"payments-mpos-overview-panel-info"}static get scopedElements(){const t=[yt,Dt,ft,dt,lt];return ws.scopedElementsFromClasses(t)}static get properties(){return{contentTitle:{type:String,attribute:"content-title"},description:{type:String},headingLevelTitle:{type:String,attribute:"heading-level-title"},headingText:{type:String,attribute:"heading-text"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},microillustration:{type:String},imageSize:{type:String,attribute:"image-size"}}}constructor(){super(),this.contentTitle="",this.description="",this.headingLevelTitle="M",this.headingText="",this.linkText="",this.loading=!1,this.microillustration="",this.imageSize=""}static get styles(){return[fs,Ct.primaryAlt,ot.primaryAlt,ut.primaryAlt,st.primaryAlt,ks.light,ks.dark,$("payments-mpos-overview-panel-info-shared-styles")]}_panelClick(){this.dispatchEvent(new CustomEvent(`${this.constructor.is}-click`,{bubbles:!0,composed:!0}))}_panelClose(){this.dispatchEvent(new CustomEvent(`${this.constructor.is}-close`,{bubbles:!0,composed:!0}))}get _panelInfoTpl(){return f`
      ${this.loading?f` <div class="skeleton"></div> `:f` ${this._contentTpl} `}
    `}get _contentHeaderTpl(){return f`
      <bbva-header-category
        data-type="close"
        .optionIcon="${z()}"
        .text="${this.headingText}"
        @header-category-link-click="${this._panelClose}"
      ></bbva-header-category>
    `}get _contentTpl(){return f`
      <div class="content-panel">
        ${this.headingText?this._contentHeaderTpl:""}
        ${this.microillustration?this._contentImageTpl:""}
        <div class="content-text">
          ${this.contentTitle?this._contentTitleTpl:""} ${this._contentTextTpl}
        </div>
      </div>
    `}get _contentImageTpl(){return Number.isNaN(Number(this.imageSize))?f`
          <bbva-clip-microillustration
            disabled-tabindex
            microillustration="${this.microillustration}"
            size="${this.imageSize}"
          >
          </bbva-clip-microillustration>
        `:f`
          <bbva-type-icon
            size="${this.imageSize}"
            icon="${U()}"
            icon-color="${this.iconColor}"
          ></bbva-type-icon>
        `}get _contentTitleTpl(){return f`
      <bbva-type-text
        class="title"
        inherit
        tag="h2"
        .size="${this.headingLevelTitle}"
        .text="${this.contentTitle}"
      ></bbva-type-text>
    `}get _contentTextTpl(){return f`
      ${this.description?this._contentDescriptionTpl:""}
      <slot name="slot-content"></slot>
      ${this.linkText?this._contentLinkFooterTpl:""}
    `}get _contentDescriptionTpl(){return f`
      <bbva-type-text class="description-content" inherit .text="${this.description}">
      </bbva-type-text>
    `}get _contentLinkFooterTpl(){return f` <bbva-type-link @click="${this._panelClick}"> ${this.linkText} </bbva-type-link> `}render(){return f` ${this._panelInfoTpl} `}}var xs=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.panel-info__wrapper {
  padding: 1rem;
}

[data-tag-name=bbva-help-modal] {
  z-index: 20;
  --bbva-help-modal-padding: 0;
  --bbva-help-modal-footer-padding: 0;
}

[data-tag-name=payments-mpos-overview-panel-info] {
  --payments-mpos-overview-panel-info-content-panel-box-shadow: none;
  --payments-mpos-overview-panel-info-content-panel-padding: 0;
  --payments-mpos-overview-panel-info-description-margin: 0;
  --payments-mpos-overview-panel-info-title-margin: 1rem 0 0;
}

[data-tag-name=payments-mpos-overview-list-simple] {
  --payments-mpos-overview-list-simple-columns-inner-padding: 0.5rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 1.5rem 1rem 0;
}
`;class Ts extends(D(m(P(_e(la(na(_))))))){static get is(){return"payments-mpos-overview-cancelled-link-receipt"}static get scopedElements(){const t=[kt,Tt,$s,ws];return Ts.scopedElementsFromClasses(t)}static get properties(){return{commission:{type:Number},merchantData:{type:Object,attribute:"merchant-data"},operationData:{type:Object,attribute:"operation-data"},visible:{type:Boolean}}}static get styles(){return[xs,$("payments-mpos-overview-cancelled-link-receipt-shared-styles")]}constructor(){super(),this.commission=0,this.merchantData={},this.operationData={},this.visible=!1}updated(t){t.forEach(((t,e)=>{"visible"===e&&(this.visible?()=>this.addView(this):()=>this.closeView(this))()}))}_getTranslation(t){return this.t(`${this.constructor.is}-${t}`)}_handleExitModal(t){"notification-message-link-click"===t.type?this._dispatchEvent(`${this.constructor.is}-manage-links-navigate`):this._dispatchEvent(`${this.constructor.is}-exit-receipt`),this._dispatchEvent(`${this.constructor.is}-state-reset`),this.operationData={}}get _panelInfoTpl(){return f`
      <div class="panel-info__wrapper">
        <payments-mpos-overview-panel-info
          content-title="${this._getTranslation("link-generated")}"
          description="${this._getTranslation("link-message")}"
          heading-level-title="3XL"
          image-size="M"
          microillustration="success"
        >
        </payments-mpos-overview-panel-info>
      </div>
    `}get _notificationTpl(){return f`
      <bbva-notification-message
        book-title
        message-title="${this._getTranslation("link-status-info")}"
        link-title="${this._getTranslation("go-manage-links")}"
        @notification-message-link-click="${t=>this._handleExitModal(t)}"
      ></bbva-notification-message>
    `}get _voucherDataTpl(){return f`
      <payments-mpos-overview-voucher-data
        commission="${this.commission}"
        currency-code="${this.currencyCode}"
        is-link
        language="${this.language}"
        .voucherData="${this.operationData}"
      ></payments-mpos-overview-voucher-data>
    `}render(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this._getTranslation("close-modal")}"
        aria-label="${this._getTranslation("description")}"
        header-text="${this._getTranslation("header-text")}"
        hide-content-padding-top
        full-height
        ?visible="${this.visible}"
        @help-modal-close="${t=>this._handleExitModal(t)}"
      >
        ${this.visible&&Object.keys(this.operationData).length?f`
              <div slot="slot-content">
                ${this._panelInfoTpl}${this._voucherDataTpl} ${this._notificationTpl}
              </div>
            `:""}
      </bbva-help-modal>
    `}}var Ss=g`
:host {
  display: block;
  box-sizing: border-box;
  height: 100%;
  width: 100%;
  --bbva-help-modal-padding: 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=payments-mpos-overview-list-simple] {
  --payments-mpos-overview-list-simple-columns-inner-padding: 0.625rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 1.5rem 1rem;
}

.products-summary__wrapper {
  margin-bottom: 1rem;
}

[data-tag-name=bbva-button-row] {
  --bbva-button-action-dark-mode-color: var(--payments-mpos-overview-dark-mode-button-row-color);
  --bbva-button-action-active-dark-mode-color: var(--payments-mpos-overview-dark-mode-active-button-row-color);
}
`;const Cs=["receipt-share","payment-voucher-share","cancel-charge"],Ds=[{label:"check-detail",linkMessage:"go-to-dashboard"},{label:"notification",linkMessage:""}];class Es extends(D(m(P(la(_e(fa(na(_)))))))){static get is(){return"payments-mpos-overview-card-reader-receipt"}static get scopedElements(){const t=[Mt,kt,Tt,$s,Fa];return Es.scopedElementsFromClasses(t)}static get properties(){return{cardReaderDeviceId:{type:String,attribute:"card-reader-device-id"},commission:{type:Number},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},merchant:{type:Object},openpayData:{type:Object,attribute:"openpay-data"},operationData:{type:Object,attribute:"operation-data"},variant:{type:String,reflect:!0},visible:{type:Boolean}}}static get styles(){return[Ss,$("payments-mpos-overview-card-reader-receipt-shared-styles"),Et.primaryAlt]}constructor(){super(),this.cardReaderDeviceId="",this.commission=0,this.hasFeatureHeaderHidden=!1,this.merchant={},this.openpayData={},this.operationData={},this.variant="2xl",this.visible=!1}_getTranslation(t){return this.t(`${this.constructor.is}-${t}`)}updated(t){t.has("openpayData")&&Object.keys(this.openpayData).length&&this._dispatchEvent(`${this.constructor.is}-action-load`,{id:this.openpayData.id,state:"success"}),t.has("visible")&&(this.visible?()=>this.addView(this):()=>this.closeView(this))()}_handleRowButtonClick(t){let e="";"receipt-share"!==Cs[t.detail]&&"cancel-charge"!==Cs[t.detail]||(e=this._getPayloadShareReceiptEvent()),this._dispatchEvent(`${this.constructor.is}-${Cs[t.detail]}`,e)}_getPayloadShareReceiptEvent(){return{...this.openpayData,...this.operationData,currency:this.currencyCode,cardReaderDeviceId:this.cardReaderDeviceId,productsDetail:this.formattedProductsDetailFromReceipt(this.operationData.products,this.currencyCode)}}_handleExitModal(t){"help-modal-footer-link-click"===t.type?(this._dispatchEvent(`${this.constructor.is}-charge`),this._dispatchEvent(`${this.constructor.is}-action-step-load`,{step:1})):this._dispatchEvent(`${Fe}-exit-receipt`),this.visible=!1}get _commission(){return this.commission*this.operationData.totalPrice}get _numericCardNumber(){const{cardNumber:t}=this.openpayData;return Number(t.substring(t.length-4))}get _showPanelAmount(){return!Number.isNaN(Number(this.operationData.iva))}get _buttonRowTpl(){const t=[{icon:e(),label:this._getTranslation("share-voucher")},{icon:i(),label:this._getTranslation("share-payment-receipt")},{icon:o(),label:this._getTranslation("cancel-charge")}];return f`
      <bbva-button-row
        ambient="primary-alt"
        accessibility-text="${this._getTranslation("available-actions")}"
        .options="${t}"
        @button-row-item-click="${this._handleRowButtonClick}"
      ></bbva-button-row>
    `}get _panelAmountTpl(){this.openpayData.date=new Date;const t=[{text:this.getIvaText(this.operationData.iva),amount:this._showPanelAmount?this.operationData.ivaAmount:""}];return f`
      <payments-mpos-overview-panel-detail
        amount="${this.operationData.totalPrice}"
        currency-code="${this.currencyCode}"
        language="${this.language}"
        local-currency="${this.localCurrency}"
        main-text="${this._getTranslation("successful")}"
        microillustration="success"
        microillustration-size="M"
        text-amount="${this._getTranslation("amount-to-charge")}"
        type="success"
        variant="${this.variant}"
        .description="${t}"
      >
      </payments-mpos-overview-panel-detail>
    `}get _notificationTpl(){return f`
      ${Ds.map((({label:t,linkMessage:e})=>f`
          <bbva-notification-message
            book-title
            message-title="${this._getTranslation(t)}"
            link-title="${e?this._getTranslation(e):""}"
            @notification-message-link-click="${this._handleExitModal}"
          ></bbva-notification-message>
        `))}
    `}get _voucherDataTpl(){return f`
      <payments-mpos-overview-voucher-data
        commission="${this.commission}"
        currency-code="${this.currencyCode}"
        date="${this.openpayData.date}"
        language="${this.language}"
        .voucherData="${this._getPayloadShareReceiptEvent()}"
      ></payments-mpos-overview-voucher-data>
    `}render(){return f`
      <bbva-help-modal
        aria-label="${this._getTranslation("")}"
        full-height
        header-close-icon-aria-label="${this._getTranslation("close-modal")}"
        header-text="${this.hasFeatureHeaderHidden?"":this._getTranslation("charge")}"
        header-type="modal"
        hide-content-padding-top
        ?visible="${this.visible}"
        @help-modal-close="${this._handleExitModal}"
        @help-modal-footer-link-click="${this._handleExitModal}"
        @help-modal-footer-button-click="${this._handleExitModal}"
      >
        ${Object.keys(this.operationData).length&&Object.keys(this.openpayData).length&&f`
          <div slot="slot-content">
            ${this._panelAmountTpl} ${this._voucherDataTpl} ${this._notificationTpl}
            ${this._buttonRowTpl}
          </div>
        `}
      </bbva-help-modal>
    `}}var Ms=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.container {
  display: flex;
  flex-direction: column;
  height: calc(100vh - 4.0625rem);
  padding: 1rem;
}

[data-tag-name=bbva-core-image] {
  width: 9rem;
  height: 9rem;
}

[data-tag-name=bbva-notification-message] {
  margin-top: 1rem;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}
[data-tag-name=bbva-help-modal].warning-modal {
  --bbva-help-modal-padding: inherit;
}
`;class Ps extends(D(m(_e(na(_))))){static get is(){return"payments-mpos-overview-card-reader-modal"}static get scopedElements(){return{"bbva-core-image":q,"bbva-help-modal":kt,"bbva-type-text":dt,"bbva-notification-message":Tt}}static get properties(){return{isDeviceConnected:{type:Boolean,attribute:"is-device-connected"},defaultDevice:{type:Object,attribute:"default-device"},operationType:{type:String,attribute:"operation-type"},visible:{type:Boolean},_isLoaderModalVisible:{type:Boolean,attribute:"is-loader-modal-visible"},_isWarningModalVisible:{type:Boolean,attribute:"is-warning-modal-visible"}}}static get styles(){return[Ms,st.primaryAlt,$("payments-mpos-overview-card-reader-modal-shared-styles")]}constructor(){super(),this.isDeviceConnected=!1,this.defaultDevice={},this.operationType=ki,this.visible=!1,this._isLoaderModalVisible=!1,this._isWarningModalVisible=!1}updated(t){t.forEach(((t,e)=>{"visible"===e&&(this._isLoaderModalVisible=this.visible,this.visible?(this.addView(this),this._dispatchEvent(`${this.constructor.is}-load`)):(this._isWarningModalVisible=this.visible,this.closeView(this)))}))}_navigateBack(){this._toggleModalsVisibility()}_toggleModalsVisibility(t){t&&t.stopPropagation(),this._isLoaderModalVisible=!this._isLoaderModalVisible,this._isWarningModalVisible=!this._isWarningModalVisible}get _descriptionTpl(){var t;return this.isDeviceConnected?f`
          <bbva-type-text
            size="S"
            text="${this.t(`${this.constructor.is}-description-${this.operationType}`)}"
          ></bbva-type-text>
        `:f`
          <bbva-type-text
            size="S"
            text="${this.t(`${this.constructor.is}-description-loading`,{deviceName:(null===(t=this.defaultDevice)||void 0===t?void 0:t.name)??""})}"
          ></bbva-type-text>
        `}get _notificationMessageTpl(){return this.operationType===ki?f`
          <bbva-notification-message
            book-title
            message-title="${this.t(`${this.constructor.is}-notification-message`)}"
            variant="caution"
          ></bbva-notification-message>
        `:""}get _warningModalTpl(){return f`
      <bbva-help-modal
        aria-label="${this.t(`${this.constructor.is}-warning-modal`)}"
        body-text="${this.t(`${this.constructor.is}-warning-modal-body-text`)}"
        button-text="${this.t(`${this.constructor.is}-warning-modal-button-text`)}"
        class="warning-modal"
        header-text="${this.t(`${this.constructor.is}-warning-modal-header-text`)}"
        modal-type="caution"
        title-icon="${F()}"
        title-text="${this.t(`${this.constructor.is}-warning-modal-title-text`)}"
        ?visible="${this._isWarningModalVisible}"
        @help-modal-header-click="${t=>this._toggleModalsVisibility(t)}"
        @help-modal-veil-click="${t=>this._toggleModalsVisibility(t)}"
        @help-modal-swipe-close="${t=>this._toggleModalsVisibility(t)}"
        @help-modal-footer-button-click="${t=>this._toggleModalsVisibility(t)}"
      >
      </bbva-help-modal>
    `}render(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t(`${this.constructor.is}-close-modal`)}"
        header-text="${this.t(`${this.constructor.is}-header-title-${this.operationType}`)}"
        hide-content-padding-top
        full-height
        role="dialog"
        ?visible="${this._isLoaderModalVisible}"
        @help-modal-header-click="${t=>this._toggleModalsVisibility(t)}"
        @modal-state-change="${t=>t.stopPropagation()}"
      >
        <div slot="slot-content" class="container">
          <bbva-core-image
            alt="${this.t(`${this.constructor.is}-card-reader-image-alt`)}"
            class="card-reader-image"
            src="./images/cashZone/card-reader.gif"
          ></bbva-core-image>
          ${this._descriptionTpl}${this._notificationMessageTpl}
        </div>
      </bbva-help-modal>
      ${this._warningModalTpl}
    `}}var Ls=g`
:host {
  display: block;
  box-sizing: border-box;
  padding: var(--payments-mpos-overview-item-detail-padding, 1rem);
  --_payments-mpos-overview-skeleton-quote-color: var(--payments-mpos-overview-item-detail-skeleton-color, ${et("colorPrimarySurfaceAlternativePreloading",it)});
  --_payments-mpos-overview-skeleton-quote-bg: var(--payments-mpos-overview-item-detail-skeleton-bg, transparent);
  --_payments-mpos-overview-item-detail-skeleton-animated-layer-bg: var(--payments-mpos-overview-dark-mode-item-detail-skeleton-animated-layer-bg, var(--payments-mpos-overview-item-detail-skeleton-animated-layer-bg, ${et("colorPrimarySurfaceAmbientPressed",it)}));
  --_payments-mpos-overview-item-detail-title-color-pressed: var(--payments-mpos-overview-dark-mode-item-detail-title-color-pressed, var(--payments-mpos-overview-item-detail-title-color-pressed, ${et("colorPrimarySurfaceContrastDefault",it)}));
  --_payments-mpos-overview-item-detail-bg-pressed-color: var(--payments-mpos-overview-dark-mode-item-detail-bg-pressed-color, var(--payments-mpos-overview-item-detail-bg-pressed-color, ${et("colorPrimarySurfaceAmbientPressed",it)}));
  --_payments-mpos-overview-item-detail-main-header-color: var(--payments-mpos-overview-dark-mode-item-detail-main-header-color, var(--payments-mpos-overview-item-detail-main-header-color, ${et("colorPrimaryLinkMainDefault",it)}));
  --_payments-mpos-overview-item-detail-main-header-weight: var(--payments-mpos-overview-item-detail-main-header-weight, ${et("fontWeight",y.medium)});
  --_payments-mpos-overview-item-detail-text-color: var(--payments-mpos-overview-dark-mode-item-detail-text-color, var(--payments-mpos-overview-item-detail-text-color, ${et("colorPrimaryText02Default",it)}));
  --_payments-mpos-overview-item-detail-date-color: var(--payments-mpos-overview-item-detail-date-color ,${et("colorPrimaryAltText01Default",it)});
}

:host([link]) [data-tag-name=bbva-type-date] {
  color: var(--_payments-mpos-overview-item-detail-date-color);
}

:host([ellipsis]) .title-link,
:host([ellipsis]) .title-content,
:host([ellipsis]) slot[name=subtitle]::slotted(*:first-child) {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.link-container {
  cursor: pointer;
}

.title-content {
  color: var(--_payments-mpos-overview-item-detail-main-header-color);
  font-weight: var(--_payments-mpos-overview-item-detail-main-header-weight);
}

:host([link]:active) {
  background-color: var(--_payments-mpos-overview-item-detail-bg-pressed-color);
}
:host([link]:active) .title-content {
  color: var(--_payments-mpos-overview-item-detail-title-color-pressed);
}

.content-subtitle {
  display: flex;
  justify-content: space-between;
}

:host([content-one-column]) [data-tag-name=bbva-type-amount] {
  margin: 0.5rem 0 0.5rem;
}
:host([content-one-column]) .content-subtitle {
  display: block;
}

:host([loading]) {
  position: relative;
  height: var(--payments-mpos-overview-item-detail-skeleton-height, 4.75rem);
  pointer-events: none;
  background-repeat: no-repeat;
  background-image: linear-gradient(var(--_payments-mpos-overview-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_payments-mpos-overview-skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-skeleton-quote-color) 50%);
  background-color: var(--_payments-mpos-overview-skeleton-quote-bg);
  background-size: 24px 24px, calc((37% * 2) + (16px/ 2)) 16px, calc((23% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px;
  background-position: 16px 16px, 56px 16px, calc(100% - 16px) 16px, 56px 44px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: var(--payments-mpos-overview-item-detail-skeleton-height, 4.75rem);
  background: var(--_payments-mpos-overview-item-detail-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

.content {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  width: 100%;
}
.content .title-link {
  margin-right: 1rem;
}
.content .title {
  font-size: ${et("typeMedium",T)};
  line-height: ${et("typeMedium",S)};
  font-weight: ${et("fontWeight",y.medium)};
}
.content .title-wrapper {
  display: flex;
  justify-content: space-between;
  width: 100%;
}

.subtitle {
  color: var(--_payments-mpos-overview-item-detail-text-color);
}

.details {
  margin: 0;
  padding: 0;
  list-style: none;
  font-size: ${et("typeSmall",T)};
  line-height: ${et("typeSmall",S)};
  font-style: ${et("fontStyle",y.book)};
  font-weight: ${et("fontWeight",y.book)};
}

.details-container {
  display: flex;
  align-items: end;
  justify-content: space-between;
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
`;const Rs="Enter",Is="Space";class As extends(D(P(_))){static get is(){return"payments-mpos-overview-item-detail"}static get scopedElements(){const t=[_t,$t,dt,gt];return As.scopedElementsFromClasses(t)}static get properties(){return{amount:{type:Number},amountType:{type:String,attribute:"amount-type"},amountSubtitle:{type:String,attribute:"amount-subtitle"},badge:{type:String},badgeType:{type:String,attribute:"badge-type"},contractModel:{type:String,attribute:"contract-model"},contentOneColumn:{type:Boolean,attribute:"content-one-column",reflect:!0},date:{type:String},ellipsis:{type:Boolean,reflect:!0},fourthSubtitle:{type:String,attribute:"fourth-subtitle"},heading:{type:String},headingValues:{type:Array,attribute:"heading-values"},lastUpdated:{type:String,attribute:"last-updated"},link:{type:Boolean,reflect:!0},loading:{type:Boolean,reflect:!0},secondSubtitle:{type:String,attribute:"second-subtitle"},subtitle:{type:String},thirdSubtitle:{type:String,attribute:"third-subtitle"},_variantAmount:{type:String}}}static get styles(){return[Ls,ht.primaryAlt,ct.primaryAlt,mt.primaryAlt,st.primaryAlt,$("bbva-list-default-shared-styles")]}static _setTextsTpl(t){return t.map((t=>f`
        <bbva-type-text class="subtitle" lines="1" size="S" text="${t}" unset ?hidden="${!t}">
        </bbva-type-text>
      `))}constructor(){super(),this.amount=null,this.amountSubtitle="",this.amountType="",this.badge="",this.badgeType="",this.contentOneColumn=!1,this.contractModel="",this.date="",this.ellipsis=!1,this.heading="",this.headingValues=[],this.lastUpdated="",this.link=!1,this.loading=!1,this.secondSubtitle="",this.subtitle="",this.thirdSubtitle="",this._dateOptions={hour:"2-digit",minute:"2-digit"},this._variantAmount="xl"}_destructureHeading(){const t=this.headingValues.map((t=>t.units>1?`${t.name} (${t.units}), `:`${t.name}, `));this.heading=t}_linkClicked(){this.dispatchEvent(new CustomEvent(`${this.constructor.is}-link-click`,{bubbles:!0,composed:!0}))}get _amountInTitle(){return null===this.amount||this.contentOneColumn?"":this._amountTpl}get _badgeDefaultTpl(){return f`
      <bbva-badge-default text="${this.badge}" type="${M(this.badgeType)}">
      </bbva-badge-default>
    `}get _amountTpl(){return null!==this.amount?f`
          <bbva-type-amount
            amount="${this.amount}"
            currency-code="${this.currencyCode}"
            disabled-tabindex
            language="${this.language}"
            local-currency="${this.localCurrency}"
            type="${this.amountType}"
            variant="${this._variantAmount}"
          >
          </bbva-type-amount>
        `:""}get _headerTpl(){return f`
      <div class="content">${this.link?this._linkTitleTpl:this._defaultTitleTpl}</div>
    `}get _linkTitleTpl(){return this.headingValues.length&&this._destructureHeading(),f`
      <bbva-type-text
        class="title-content"
        text="${this.heading}"
        unset
        variant="spotlight"
      ></bbva-type-text>
      ${this._amountInTitle}
    `}get _defaultTitleTpl(){return f`
      <div class="title-wrapper">
        <bbva-type-text unset class="title" text="${this.heading}"></bbva-type-text>
        ${this._amountInTitle}
      </div>
    `}get _detailsTpl(){return f`
      <div class="details-container">
        <div class="subtitles">
          ${As._setTextsTpl([this.secondSubtitle,this.thirdSubtitle])}
        </div>
        <bbva-type-date
          clock-suffix=""
          date="${this.date}"
          .options="${this._dateOptions}"
          ?utc="${this.utc}"
        ></bbva-type-date>
      </div>
      ${As._setTextsTpl([this.fourthSubtitle])}
    `}get _itemDetailTpl(){return f`
      ${this.loading?f` <div class="skeleton"></div> `:f` ${this._itemDetail} `}
    `}get _itemDetail(){return this.link?f`
          <div
            class="link-container"
            @click="${this._linkClicked}"
            @keypress="${t=>(t.code===Rs||t.code===Is)&&this._linkClicked}"
          >
            ${this._contentTpl}
          </div>
        `:f` ${this._contentTpl} `}get _contentTpl(){return f`
      ${this._headerTpl}
      <div class="content-subtitle">
        <bbva-type-text class="subtitle" lines="1" size="S" unset text="${this.subtitle}">
        </bbva-type-text>
        ${this.amountSubtitle&&f`
          <bbva-type-text class="subtitle" unset text="${this.amountSubtitle}"> </bbva-type-text>
        `}
        ${this.contentOneColumn?this._contentOneColumnTpl:""}
      </div>
      <div class="details">${this.secondSubtitle?this._detailsTpl:""}</div>
      ${this.badge?this._badgeDefaultTpl:f``}
    `}get _contentOneColumnTpl(){return f`
      ${this._amountTpl}
      ${As._setTextsTpl([this.contractModel,this.lastUpdated])}
    `}render(){return f` ${this._itemDetailTpl} `}}var Vs=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=payments-mpos-overview-panel-info] {
  --payments-mpos-overview-panel-info-content-panel-box-shadow: none;
  margin: 2rem 0;
}

[data-tag-name=payments-mpos-overview-item-detail] {
  --payments-mpos-overview-item-detail-padding: 1rem 0;
}

[data-tag-name=payments-mpos-overview-item-detail].no-default-color {
  --bbva-type-link-color: ${et("colorPrimaryAltText01Default",it)};
}

[data-tag-name=bbva-divider]:last-of-type {
  display: none;
}

[data-tag-name=bbva-header-category] {
  padding: 1.5rem 0 0 0;
}

[data-tag-name=bbva-notification-message] {
  margin-top: 0.5rem;
  margin-bottom: 1rem;
}

[data-tag-name=bbva-divider-default]:last-of-type {
  display: none;
}

[slot=slot-footer] {
  margin: 1rem;
}
`;class Bs extends(D(m(sa(_e(na(_)))))){static get is(){return"payments-mpos-overview-card-reader-settings"}static get scopedElements(){const t=[xt,Dt,kt,Tt,ft,dt,As,ws];return Bs.scopedElementsFromClasses(t)}static get properties(){return{defaultDevice:{type:Object,attribute:"default-device"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},isConfigurationMode:{type:Boolean,attribute:"is-configuration-mode"},isRefund:{type:Boolean,attribute:"is-refund"},visible:{type:Boolean},_hasLinkedDevice:{type:Boolean}}}static get styles(){return[Vs,wt.primaryAlt,Ct.primaryAlt,st.primaryAlt,ut.primaryAlt,$("payments-mpos-overview-card-reader-settings-shared-styles")]}constructor(){super(),this.defaultDevice={},this.hasFeatureHeaderHidden=!1,this.isConfigurationMode=!1,this.isRefund=!1,this.visible=!1,this._hasLinkedDevice=!1}updated(t){t.has("defaultDevice")&&Object.keys(this.defaultDevice).length&&(this._hasLinkedDevice=!0),t.has("visible")&&(this.visible?(this.addView(this),this.scanNewDevices()):this.closeView(this))}_handleLinkClick(){this.isRefund?this._dispatchEvent(`${this.constructor.is}-refund-process-close`):this._dispatchEvent(`${this.constructor.is}-charge-method-change`),this.visible=!1}get _showAvailablesSectionTitle(){return this.getDevices().filter((({address:t})=>{var e;return t!==(null===(e=this.defaultDevice)||void 0===e?void 0:e.address)})).length||this._noDevicesAvailable}get _noDevicesAvailable(){return!this.getDevices().length&&!this.isDeviceConnected&&!this._hasLinkedDevice}get _modalHeaderTitle(){return this.t(`${this.constructor.is}-${this.isConfigurationMode?"config-header-title":"charge-header-title"}`)}get _noDevicesText(){return this.isConfigurationMode?"":`${this.constructor.is}-no-devices-found`}get _noDevicesTitle(){return this.t(`${this.constructor.is}-${this.isConfigurationMode?"no-devices-linked-title":"no-devices-found-title"}`)}get _availableDevicesTitleTpl(){return this._showAvailablesSectionTitle?f`
          <bbva-header-category
            link-accessibility-text="${this.t(`${this.constructor.is}-footer-button`)}"
            option-link="${this.t(`${this.constructor.is}-footer-button`)}"
            text="${this.t(`${this.constructor.is}-availables`)}"
            @header-category-link-click="${()=>this.scanNewDevices()}"
          ></bbva-header-category>
        `:""}get _cardReaderTpl(){return this.getDevices().map((({address:t,name:e},i,a)=>{var s;return t!==(null===(s=this.defaultDevice)||void 0===s?void 0:s.address)?f`
          <payments-mpos-overview-item-detail
            class="${L({"no-default-color":this.isConfigurationMode})}"
            heading="${e}"
            link
            subtitle="${t}"
            @click="${()=>this._dispatchEvent(`${this.constructor.is}-new-device-select`,{device:a[i]})}"
          ></payments-mpos-overview-item-detail>
          <bbva-divider-default size="full"></bbva-divider-default>
        `:f``}))}get _linkedCardReaderTpl(){var t,e;return this._hasLinkedDevice?f`
          <payments-mpos-overview-item-detail
            heading="${null===(t=this.defaultDevice)||void 0===t?void 0:t.name}"
            badge="${this.t(`${this.constructor.is}-linked`)}"
            badge-type="success"
            subtitle="${null===(e=this.defaultDevice)||void 0===e?void 0:e.address}"
          ></payments-mpos-overview-item-detail>
        `:""}get _linkText(){return this.isRefund?this.t(`${this.constructor.is}-exit`):this.isConfigurationMode?"":this.t(`${this.constructor.is}-footer-link`)}get _noDevicesTpl(){return this._noDevicesAvailable?f`
          <payments-mpos-overview-panel-info
            content-title="${this._noDevicesTitle}"
            heading-level-title="3XL"
            description="${this._noDevicesText}"
            microillustration="emptystateday"
            image-size="M"
          >
          </payments-mpos-overview-panel-info>
        `:""}get _notificationTpl(){return this.isConfigurationMode?f`
          <bbva-notification-message
            message="${this.t(`${this.constructor.is}-notification-message`)}"
            message-title="${this.t(`${this.constructor.is}-notification-title`)}"
            link-title="${this.t(`${this.constructor.is}-notification-link`)}"
            @notification-message-link-click="${()=>this._dispatchEvent(`${Fe}-phone-settings-open`,{setting:"bluetooth"})}"
          ></bbva-notification-message>
        `:""}get _titleTextTpl(){return this.isConfigurationMode&&(this.getDevices().length||this._hasLinkedDevice)?f`
          <bbva-type-text text="${this.t(`${this.constructor.is}-text`)}" unset></bbva-type-text>
        `:""}get _modalFooterTpl(){return f`
      <bbva-type-link @click="${this._handleLinkClick}"> ${this._linkText} </bbva-type-link>
    `}render(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t(`${this.constructor.is}-close-modal`)}"
        header-text="${this.hasFeatureHeaderHidden?"":this._modalHeaderTitle}"
        hide-content-padding-top
        full-height
        transition-without-scroll
        ?visible="${this.visible}"
        .closeModalElements="${["header-right-primary"]}"
        @help-modal-header-click="${t=>{t.stopPropagation(),this.visible=!1,this._dispatchEvent(`${this.constructor.is}-close`)}}"
      >
        <div slot="slot-content" class="container">
          ${this._titleTextTpl} ${this._linkedCardReaderTpl} ${this._availableDevicesTitleTpl}
          ${this._cardReaderTpl} ${this._noDevicesTpl} ${this._notificationTpl}
        </div>
        <div slot="slot-footer">${this._modalFooterTpl}</div>
      </bbva-help-modal>
    `}}var Os=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=payments-mpos-overview-panel-info] {
  --payments-mpos-overview-panel-info-content-panel-box-shadow: none;
  --payments-mpos-overview-panel-info-margin-content-text: 1rem 0;
}

[data-tag-name=bbva-help-modal] .slot-footer {
  --bbva-help-modal-content-padding: 1rem;
}

.warning-modal__footer {
  padding: 1rem;
  display: flex;
  flex-direction: column;
  gap: 1rem;
  align-items: center;
  position: fixed;
  bottom: 1rem;
  left: 0;
  right: 0;
}
`;const Fs="configuration",Hs="operative";class Ns extends(D(m(_e(sa(na(_)))))){static get is(){return"payments-mpos-overview-connect-card-reader-modal"}static get scopedElements(){const t=[bt,kt,ft,Ps,Bs,ws];return Ns.scopedElementsFromClasses(t)}static get properties(){return{defaultDevice:{type:Object,attribute:"default-device"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},isCardReaderSettingsVisible:{type:Boolean,attribute:"is-card-reader-settings-visible"},mode:{type:String},operationType:{type:String,attribute:"operation-type"},visible:{type:Boolean},_isAnimationModalVisible:{type:Boolean},_isDeviceConnected:{type:Boolean,attribute:"is-device-connected"},_isToastVisible:{type:Boolean},_isWarningModalVisible:{type:Boolean}}}static get styles(){return[Os,pt.primaryAlt,ut.primaryAlt,$("payments-mpos-overview-connect-card-reader-modal-shared-styles")]}constructor(){super(),this.defaultDevice={},this.isCardReaderSettingsVisible=!1,this.mode="operative",this.operationType="charge",this.visible=!1,this._handleConnectionSuccess=this._handleConnectionSuccess.bind(this),this._isAnimationModalVisible=!1,this._isDeviceConnected=!1,this._isToastVisible=!1,this._isWarningModalVisible=!1,this._newDevice={},this._toastMessage=""}connectedCallback(){super.connectedCallback&&super.connectedCallback(),document.addEventListener("payments-mpos-overview-bluetooth-connection-success",this._handleConnectionSuccess)}disconnectedCallback(){document.removeEventListener("payments-mpos-overview-bluetooth-connection-success",this._handleConnectionSuccess),super.disconnectedCallback&&super.disconnectedCallback()}updated(t){t.forEach(((t,e)=>{"visible"!==e||this[e]||(this.closeView(this),this._closeVisibility()),"visible"===e&&this[e]&&(this.addView(this),"configuration"===this.mode&&(this.isCardReaderSettingsVisible=!0),"operative"===this.mode&&this._handleOperativeModeConnection())}))}_closeVisibility(){this._isAnimationModalVisible=!1,this.isCardReaderSettingsVisible=!1,this._isWarningModalVisible=!1,this._newDevice={},this.visible=!1,this._dispatchEvent(`${this.constructor.is}-close`)}_handleConnectionSuccess(){this.visible&&(this._isDeviceConnected=!0,this._isDefaultDeviceConnection||(this.defaultDevice={...this._newDevice},this.setCardReaderDevice(this._newDevice),this.mode===Hs&&(this.isCardReaderSettingsVisible=!1,this._isAnimationModalVisible=!0),this._dispatchEvent(`${this.constructor.is}-new-device-select`,this.defaultDevice)),this._dispatchEvent(`${this.constructor.is}-connection-success`,this._newDevice),this._showToast(this.t(`${this.constructor.is}-toast-connection-success`,{deviceId:this.defaultDevice.name})))}_handleOperativeModeConnection(){Object.keys(this.defaultDevice).length?(this._isAnimationModalVisible=!0,this.connectToBluetoothDevice({device:this.defaultDevice})):this._isWarningModalVisible=!0}_showToast(t){this._toastMessage=t,this._isToastVisible=!this._isDeviceConnected&&this.mode===Hs,this.showNotify(this._toastMessage,"","success",3e3)}_navigateBack(){this._closeVisibility()}get _isDefaultDeviceConnection(){return 0===Object.keys(this._newDevice).length}get _modalFooterTpl(){return f`
      <div class="warning-modal__footer">
        <bbva-button-default
          fullwidth
          text="${this.t(`${this.constructor.is}-warning-modal-footer-button`)}"
          @click="${()=>{this.isCardReaderSettingsVisible=!0}}"
        ></bbva-button-default>
        <bbva-type-link
          @click="${()=>{this._dispatchEvent(`${this.constructor.is}-go-to-configuration`),this._closeVisibility()}}"
        >
          ${this.t(`${this.constructor.is}-warning-modal-footer-link`)}
        </bbva-type-link>
      </div>
    `}get _cardReaderAnimationTpl(){return f`
      <payments-mpos-overview-card-reader-modal
        operation-type="${this.operationType}"
        ?visible="${this._isAnimationModalVisible}"
        .isDeviceConnected="${this._isDeviceConnected}"
        .defaultDevice="${this.defaultDevice}"
      >
      </payments-mpos-overview-card-reader-modal>
    `}get _cardReaderSettingsTpl(){return f`
      <payments-mpos-overview-card-reader-settings
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?is-configuration-mode="${this.mode===Fs}"
        ?is-refund="${this.operationType!==ki}"
        ?visible="${this.isCardReaderSettingsVisible}"
        .defaultDevice="${this.defaultDevice}"
        @payments-mpos-overview-card-reader-settings-charge-method-change="${()=>{this.isCardReaderSettingsVisible=!1,this._dispatchEvent(`${this.constructor.is}-charge-method-change`)}}"
        @payments-mpos-overview-card-reader-settings-new-device-select="${t=>{this.isCardReaderSettingsVisible=!1,this.showLoader(oi);const{device:e}=t.detail;this._newDevice={...e},this.mode===Hs?this.connectToBluetoothDevice({device:e}):this._dispatchEvent(`${this.constructor.is}-new-device-select`,e)}}"
        @payments-mpos-overview-card-reader-settings-close="${()=>{this._closeVisibility()}}"
      >
      </payments-mpos-overview-card-reader-settings>
    `}get _noDeviceWarningModalTpl(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t(`${this.constructor.is}-close-modal`)}"
        header-text="${this.t(`${this.constructor.is}-warning-modal-header-text`)}"
        full-height
        role="dialog"
        transition-without-scroll
        ?visible="${this._isWarningModalVisible}"
        @help-modal-close="${t=>{t.stopPropagation(),this._isWarningModalVisible=!1}}"
        @help-modal-header-click="${t=>{t.stopPropagation(),this._closeVisibility(),this._dispatchEvent(`${this.constructor.is}-warning-modal-close`)}}"
      >
        <div slot="slot-content">
          <payments-mpos-overview-panel-info
            content-title="${this.t(`${this.constructor.is}-warning-modal-body-title`)}"
            description="${this.t(`${this.constructor.is}-warning-modal-body-text`)}"
            heading-level-title="3XL"
            image-size="M"
            microillustration="caution"
          >
          </payments-mpos-overview-panel-info>
          ${this._modalFooterTpl}
        </div>
      </bbva-help-modal>
    `}render(){return f`
      ${this._noDeviceWarningModalTpl} ${this._cardReaderAnimationTpl}
      ${this._cardReaderSettingsTpl}
    `}}var zs=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.panel-info__wrapper {
  padding: 1rem;
}

[data-tag-name=payments-mpos-overview-list-simple] {
  --payments-mpos-overview-list-simple-columns-inner-padding: 0.5rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 1.5rem 1rem;
}

.products-summary__wrapper {
  margin-bottom: 1rem;
}

[data-tag-name=bbva-help-modal].receipt-modal {
  --bbva-help-modal-padding: 0;
}

[data-tag-name=bbva-button-row] {
  --bbva-button-action-dark-mode-color: var(--payments-mpos-overview-dark-mode-button-row-color);
  --bbva-button-action-active-dark-mode-color: var(--payments-mpos-overview-dark-mode-active-button-row-color);
}
`;const Us=["receipt-share","link-cancel"],qs=[{label:"link-status-info",linkMessage:"go-manage-links",paramLabel:!1},{label:"link-expiration-info",linkMessage:"",paramLabel:!0}];class js extends(D(m(P(_e(la(wa(sa(fa(na(_)))))))))){static get is(){return"payments-mpos-overview-link-receipt"}static get scopedElements(){const t=[Mt,kt,Tt,$s,ws];return js.scopedElementsFromClasses(t)}static get properties(){return{commission:{type:Number},expirationDays:{type:String,attribute:"expiration-days"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},merchant:{type:Object},openpayData:{type:Object,attribute:"openpay-data"},operationData:{type:Object,attribute:"operation-data"},visible:{type:Boolean},_isLinkWarningModalVisible:{type:Boolean}}}static get styles(){return[zs,$("payments-mpos-overview-link-receipt-shared-styles"),Et.primaryAlt]}constructor(){super(),this.commission=0,this.expirationDays="",this.hasFeatureHeaderHidden=!1,this.merchant={},this.openpayData={},this.operationData={},this.visible=!1,this._isLinkWarningModalVisible=!1}updated(t){t.has("openpayData")&&Object.keys(this.openpayData).length&&this._dispatchEvent(`${this.constructor.is}-action-load`,{id:this.openpayData.id,state:"generated"}),t.has("visible")&&(this.visible?()=>this.addView(this):()=>this.closeView(this))()}_getTranslation(t){return this.t(`${this.constructor.is}-${t}`)}_handleCancelLink(t){t.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-link-cancel`),this._isLinkWarningModalVisible=!1}_handleRowButtonClick(t){const e=Us[t.detail];if("link-cancel"===e)this._isLinkWarningModalVisible=!0;else{const t=this._getPayloadShareReceiptEvent();this._dispatchEvent(`${this.constructor.is}-${e}`,t)}}_getPayloadShareReceiptEvent(){return{...this.openpayData,...this.operationData,currency:this.currencyCode,productsDetail:this.formattedProductsDetailFromReceipt(this.operationData.products,this.currencyCode)}}_handleExitModal(t){"help-modal-footer-link-click"===t.type?(this._dispatchEvent(`${this.constructor.is}-charge`),this._dispatchEvent(`${this.constructor.is}-action-step-load`,{step:1})):"notification-message-link-click"===t.type?this._dispatchEvent(`${this.constructor.is}-manage-links-navigate`):this._dispatchEvent(`${Fe}-exit-receipt`),this._dispatchEvent(`${this.constructor.is}-state-reset`),this.visible=!1}_handleShareLink(){const{checkoutLink:t}=this.openpayData,{totalPrice:e}=this.operationData,i=`${u(this.currencyCode,this.currencyCode)} ${Number(e).toFixed(2)}`;this._dispatchEvent(`${Fe}-payment-link-send`,this.t("payments-mpos-overview-payment-link-msg",{link:t,paymentAmount:i,merchant:this.merchant.name}))}get _buttonRowTpl(){const t=[{icon:e(),label:this._getTranslation("receipt-share")},{icon:o(),label:this._getTranslation("cancel-link")}];return f`
      <bbva-button-row
        ambient="primary-alt"
        accessibility-text="${this._getTranslation("available-actions")}"
        .options="${t}"
        @button-row-item-click="${this._handleRowButtonClick}"
      ></bbva-button-row>
    `}get _cancelLinkWarningModal(){return f`
      <bbva-help-modal
        aria-label="${this.t(`${this.constructor.is}-warning-modal`)}"
        body-text="${this.t(`${this.constructor.is}-cancel-link-warning-body`)}"
        button-text="${this.t(`${this.constructor.is}-cancel-link-warning-button`)}"
        header-text="${this.t(`${this.constructor.is}-cancel-link-warning-header`)}"
        link-text="${this.t(`${this.constructor.is}-cancel-link-warning-link`)}"
        modal-type="caution"
        title-icon="${F()}"
        title-text="${this.t(`${this.constructor.is}-cancel-link-warning-title`)}"
        ?visible="${this._isLinkWarningModalVisible}"
        @help-modal-footer-button-click="${this._handleCancelLink}"
        @help-modal-footer-link-click="${t=>{t.stopPropagation(),this._isLinkWarningModalVisible=!1}}"
        @help-modal-close="${t=>{t.stopPropagation(),this._isLinkWarningModalVisible=!1}}"
        @modal-state-change="${t=>t.stopPropagation()}"
      >
      </bbva-help-modal>
    `}get _panelInfoTpl(){return f`
      <div class="panel-info__wrapper">
        <payments-mpos-overview-panel-info
          content-title="${this._getTranslation("link-generated")}"
          description="${this._getTranslation("link-message")}"
          heading-level-title="3XL"
          image-size="M"
          link-text="${this._getTranslation("share-link")}"
          microillustration="success"
          @payments-mpos-overview-panel-info-click="${this._handleShareLink}"
        >
        </payments-mpos-overview-panel-info>
      </div>
    `}get _notificationTpl(){return f`
      ${qs.map((({label:t,linkMessage:e,paramLabel:i})=>f`
          <bbva-notification-message
            book-title
            message-title="${i?this.t(`${this.constructor.is}-${t}`,{days:this.getValidPeriodLinkText(this.expirationDays)}):this._getTranslation(t)}"
            link-title="${e?this._getTranslation(e):""}"
            @notification-message-link-click="${this._handleExitModal}"
          ></bbva-notification-message>
        `))}
    `}get _voucherDataTpl(){return f`
      <payments-mpos-overview-voucher-data
        commission="${this.commission}"
        currency-code="${this.currencyCode}"
        is-link
        language="${this.language}"
        .voucherData="${this._getPayloadShareReceiptEvent()}"
      ></payments-mpos-overview-voucher-data>
    `}render(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this._getTranslation("close-modal")}"
        aria-label="${this._getTranslation("")}"
        class="receipt-modal"
        header-text="${this.hasFeatureHeaderHidden?"":this._getTranslation("charge")}"
        header-type="modal"
        hide-content-padding-top
        full-height
        ?visible="${this.visible}"
        @help-modal-close="${this._handleExitModal}"
        @help-modal-footer-link-click="${this._handleExitModal}"
        @help-modal-footer-button-click="${this._handleExitModal}"
      >
        ${Object.keys(this.operationData).length&&f`
            <div slot="slot-content">
              ${this._panelInfoTpl} ${this._voucherDataTpl} ${this._notificationTpl}
              ${this._buttonRowTpl}
            </div>
          `}
      </bbva-help-modal>
      ${this._cancelLinkWarningModal}
    `}}var Ws=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

[data-tag-name=bbva-type-text] {
  padding: 1rem;
  padding-top: 0;
}

[data-tag-name=bbva-type-text]:first-child {
  margin: 1rem 0 1rem 1rem;
  padding: 0;
}

[data-tag-name=bbva-notification-message] {
  margin: 1.5rem 1rem;
}
`;class Js extends(D(m(_e(_)))){static get is(){return"payments-mpos-overview-confirm-refund-modal"}static get scopedElements(){const t=[kt,Tt,dt,$s];return Js.scopedElementsFromClasses(t)}static get properties(){return{commission:{type:Number},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},language:{type:String},transactionData:{type:Object,attribute:"transaction-data"},visible:{type:Boolean}}}constructor(){super(),this.commission=0,this.hasFeatureHeaderHidden=!1,this.language="",this.transactionData={},this.visible=!1}static get styles(){return[Ws,st.primaryAlt,$("payments-mpos-overview-confirm-refund-modal-shared-styles")]}get _confirmationModalTpl(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t(`${this.constructor.is}`)}"
        button-text="${this.t(`${this.constructor.is}-button`)}"
        header-text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-header`)}"
        header-type="modal"
        hide-content-padding-top
        fixed-footer
        full-height
        ?visible="${this.visible}"
      >
        ${this.visible&&f`
          <div slot="slot-content">
            ${this._subtitleTpl} ${this._voucherDataTpl} ${this._notificationTpl}
          </div>
        `}
      </bbva-help-modal>
    `}get _notificationTpl(){return f`
      <bbva-notification-message
        book-title
        message-title="${this.t(`${this.constructor.is}-notification-content`)}"
      ></bbva-notification-message>
    `}get _subtitleTpl(){return f`
      <bbva-type-text
        font-weight="700"
        size="3XL"
        text="${this.t(`${this.constructor.is}-title`)}"
        unset
      ></bbva-type-text>
      <bbva-type-text
        unset
        size="S"
        text="${this.t(`${this.constructor.is}-content`)}"
      ></bbva-type-text>
    `}get _voucherDataTpl(){return f`
      <payments-mpos-overview-voucher-data
        commission="${this.commission}"
        currency-code="${this.currencyCode}"
        is-refund
        language="${this.language}"
        .voucherData="${this.transactionData}"
        .isLink="${"LINK_COBRO"===this.transactionData.payment_method_name||this.transactionData.checkoutLink}"
      ></payments-mpos-overview-voucher-data>
    `}render(){return f` ${this._confirmationModalTpl} `}}var Gs=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.panel-info__wrapper {
  padding: 1rem;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
  --bbva-help-modal-footer-padding: 0;
}

[data-tag-name=payments-mpos-overview-panel-info] {
  --payments-mpos-overview-panel-info-content-panel-box-shadow: none;
}

[data-tag-name=payments-mpos-overview-list-simple] {
  --payments-mpos-overview-list-simple-columns-inner-padding: 0.625rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 1.5rem 1rem;
}

[data-tag-name=bbva-button-row] {
  --bbva-button-action-dark-mode-color: var(--payments-mpos-overview-dark-mode-button-row-color);
  --bbva-button-action-active-dark-mode-color: var(--payments-mpos-overview-dark-mode-active-button-row-color);
}
`;const Xs=["receipt-share","voucher-share"],Ys="dashboard";class Ks extends(D(m(P(_e(fa(na(_))))))){static get is(){return"payments-mpos-overview-refund-receipt-modal"}static get scopedElements(){const t=[Mt,kt,Tt,$s,ws];return Ks.scopedElementsFromClasses(t)}static get properties(){return{cardReaderDeviceId:{type:String,attribute:"card-reader-device-id"},commission:{type:Number},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},mode:{type:String},refundData:{type:Object,attribute:"refund-data"},visible:{type:Boolean}}}static get styles(){return[Gs,$(`${Ks.is}-shared-styles`),Et.primaryAlt]}constructor(){super(),this.cardReaderDeviceId="",this.commission=0,this.hasFeatureHeaderHidden=!1,this.mode="voucher",this.refundData={},this.visible=!1}updated(t){t.forEach((async(t,e)=>{"visible"===e&&(this.visible?()=>this.addView(this):()=>this.closeView(this))()}))}_getPayloadShareReceiptEvent(){var t;return{...this.refundData,currency:this.currencyCode,cardReaderDeviceId:this.cardReaderDeviceId,...null!==(t=this.refundData)&&void 0!==t&&t.products?{productsDetail:this.formattedProductsDetailFromReceipt(this.refundData.products,this.currencyCode)}:{}}}_getTranslation(t){return this.t(`${this.constructor.is}-${t}`)}_handleButtonRowClick(t){let e="";"receipt-share"===Xs[t.detail]&&(e=this._getPayloadShareReceiptEvent()),this._dispatchEvent(`${this.constructor.is}-${Xs[t.detail]}`,e)}_handleExitModal(t){t.stopPropagation(),"help-modal-footer-link-click"===t.type?this._dispatchEvent(`${this.constructor.is}-charge`):"notification-message-link-click"===t.type?this._dispatchEvent(`${this.constructor.is}-dashboard-navigate`):this._dispatchEvent(`${Fe}-exit-receipt`),this.visible=!1}get _buttonRowTpl(){const t=[{icon:e(),label:this._getTranslation("receipt-share")},{icon:i(),label:this._getTranslation("voucher-share")}];return f`
      <bbva-button-row
        ambient="primary-alt"
        accessibility-text="${this._getTranslation("available-actions")}"
        .options="${t}"
        @button-row-item-click="${this._handleButtonRowClick}"
      ></bbva-button-row>
    `}get _panelInfoTpl(){return f`
      <div class="panel-info__wrapper">
        <payments-mpos-overview-panel-info
          content-title="${this._getTranslation(`panel-info-title-${this.mode}`)}"
          description="${this._getTranslation("panel-info-subtitle")}"
          heading-level-title="3XL"
          microillustration="success"
          image-size="M"
        >
        </payments-mpos-overview-panel-info>
      </div>
    `}get _notificationTpl(){return f`
      <bbva-notification-message
        book-title
        message-title="${this._getTranslation("notification-voucher")}"
        link-title="${this.mode===Ys?this._getTranslation("notification-link"):""}"
        @notification-message-link-click="${t=>this._handleExitModal(t)}"
      ></bbva-notification-message>
    `}get _voucherDataTpl(){return f`
      <payments-mpos-overview-voucher-data
        commission="${this.commission}"
        currency-code="${this.currencyCode}"
        language="${this.language}"
        .voucherData="${this.refundData}"
        .isLink="${"LINK_COBRO"===this.refundData.payment_method_name||this.refundData.checkout_link}"
        is-refund
      ></payments-mpos-overview-voucher-data>
    `}render(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t(`${this.constructor.is}`)}"
        header-text="${this.hasFeatureHeaderHidden?"":this._getTranslation(`header-text-${this.mode}`)}"
        header-type="modal"
        hide-content-padding-top
        full-height
        ?visible="${this.visible}"
        @help-modal-close="${this._handleExitModal}"
      >
        ${this.visible&&f`
          <div slot="slot-content">
            ${this._panelInfoTpl}${this._voucherDataTpl}
            ${this._notificationTpl}${this._buttonRowTpl}
          </div>
        `}
      </bbva-help-modal>
    `}}var Zs=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;const Qs="dashboard",to="voucher",eo={[Qs]:wi,[to]:xi},io={LINK_COBRO:{handler:"_handleLinkRefund",method:"applyLinkRefund"},CARD_PRESENT:{handler:"_handleCardRefund",method:"applyTransactionRefund"},PRESENT_CARD:{handler:"_handleCardRefund",method:"applyTransactionRefund"},TAP_ON_PHONE:{handler:"_executeRefund",method:"applyTopRefund"}};class ao extends(D(m(P(_e(sa(Qi(na(_)))))))){static get is(){return"payments-mpos-overview-refund-handler"}static get properties(){return{commission:{type:Number},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},isCardReaderSettingsVisible:{type:Boolean,attribute:"is-card-reader-settings-visible"},isTopReady:{type:Boolean,attribute:"is-top-ready"},mode:{type:String},singleUseJws:{type:String,attribute:"single-use-jws"},transactionData:{type:Object,attribute:"transaction-data"},visible:{type:Boolean},_showConfirmationModal:{type:Boolean},_showConnectCardReader:{type:Boolean},_showSuccessVoucher:{type:Boolean},_showWarningModal:{type:Boolean}}}static get scopedElements(){const t=[kt,Js,Ns,Ks];return ao.scopedElementsFromClasses(t)}static get styles(){return[Zs,$("payments-mpos-overview-refund-handler-shared-styles")]}constructor(){super(),this.commission=0,this.hasFeatureHeaderHidden=!1,this.isCardReaderSettingsVisible=!1,this.isTopReady=!1,this.mode="voucher",this.singleUseJws="",this.transactionData={},this.visible=!1,this._handleRefundSuccess=this._handleRefundSuccess.bind(this),this._paymentMethod="",this._refundResponse={},this._showConfirmationModal=!1,this._showConnectCardReader=!1,this._showSuccessVoucher=!1,this._showWarningModal=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),document.addEventListener("payments-mpos-overview-apply-refund-success",this._handleRefundSuccess)}disconnectedCallback(){document.removeEventListener("payments-mpos-overview-apply-refund-success",this._handleRefundSuccess),super.disconnectedCallback&&super.disconnectedCallback()}updated(t){t.forEach(((t,e)=>{if("singleUseJws"===e&&t!==this[e]&&this[e]){this[io[this._paymentMethod].handler]()}"visible"===e&&(this.visible?()=>this._handleOpenRefundHandler():()=>this._resetProperties())(),"transactionData"===e&&t!==this[e]&&Object.keys(this[e]).length&&(this._paymentMethod=this.transactionData.checkoutLink?"LINK_COBRO":this.transactionData.payment_method_name||this.transactionData.paymentMethod)}))}_executeRefund(){this[io[this._paymentMethod].method]({transactionData:this.transactionData,singleUseJws:this.singleUseJws}),this.singleUseJws=""}_exitRefundProcess(t){t.stopPropagation(),this._resetProperties()}_handleLinkRefund(){this._executeRefund()}_handleCardRefund(){this._showConnectCardReader=!0}_topUnsupportedGuard(){"TAP_ON_PHONE"!==this.transactionData.payment_method_name||this.isTopReady||this._dispatchEvent(`${this.constructor.is}-top-error-show`)}_handleOpenRefundHandler(){this.addView(this),this._topUnsupportedGuard(),this.mode===to&&(this._showWarningModal=!0),this.mode===Qs&&(this._showConfirmationModal=!0)}_handleRefundSuccess(t){this._refundResponse={...t.detail},this._showSuccessVoucher=!0,this._showConnectCardReader=!1,this._dispatchEvent(`${this.constructor.is}-refund-success`)}_requestSingleUseJws(){this._dispatchEvent(`${this.constructor.is}-single-use-jws-request`)}_resetProperties(){this.visible=!1,this._showConnectCardReader=!1,this._showSuccessVoucher=!1,this._showWarningModal=!1,this._showConfirmationModal=!1,this.transactionData={},this._refundResponse={},this.closeView(this),this._dispatchEvent(`${this.constructor.is}-refund-cancel`)}get _refundData(){return{...this.transactionData,...this._refundResponse}}get _confirmationModalTpl(){return f`
      <payments-mpos-overview-confirm-refund-modal
        commission="${this.commission}"
        currency-code="${this.currencyCode}"
        language="${this.language}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${this._showConfirmationModal}"
        .transactionData="${this.transactionData}"
        @help-modal-close="${t=>{t.stopPropagation(),this._showConfirmationModal=!1}}"
        @help-modal-footer-button-click="${t=>{t.stopPropagation(),this._requestSingleUseJws()}}"
        @help-modal-header-click="${this._exitRefundProcess}"
      >
      </payments-mpos-overview-confirm-refund-modal>
    `}get _connectCardReaderTpl(){var t;return f`
      <payments-mpos-overview-connect-card-reader-modal
        operation-type="${eo[this.mode]}"
        ?is-card-reader-settings-visible="${this.isCardReaderSettingsVisible}"
        ?visible="${this._showConnectCardReader}"
        .defaultDevice="${null===(t=this.getSelectedMerchant())||void 0===t?void 0:t.cardReaderDevice}"
        @payments-mpos-overview-connect-card-reader-modal-connection-success="${()=>{this._executeRefund()}}"
        @payments-mpos-overview-connect-card-reader-modal-close="${()=>{this._showConnectCardReader=!1}}"
        @payments-mpos-overview-connect-card-reader-modal-warning-modal-close="${()=>{this._resetProperties()}}"
        @payments-mpos-overview-card-reader-settings-refund-process-close="${()=>{this._resetProperties()}}"
      >
      </payments-mpos-overview-connect-card-reader-modal>
    `}get _successVoucherTpl(){var t,e;return f`
      <payments-mpos-overview-refund-receipt-modal
        card-reader-device-id="${null===(t=this.getSelectedMerchant())||void 0===t||null===(e=t.cardReaderDevice)||void 0===e?void 0:e.name}"
        commission="${this.commission}"
        currency-code="${this.currencyCode}"
        language="${this.language}"
        mode="${this.mode}"
        ?visible="${this._showSuccessVoucher}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        .refundData="${this._refundData}"
        @payments-mpos-overview-refund-receipt-modal-charge="${this._resetProperties}"
        @payments-mpos-overview-exit-receipt="${this._resetProperties}"
        @payments-mpos-overview-refund-receipt-modal-dashboard-navigate="${t=>{this.navigateBackTo("dashboard"),this._exitRefundProcess(t)}}"
      >
      </payments-mpos-overview-refund-receipt-modal>
    `}get _warningModalTpl(){return f`
      <bbva-help-modal
        body-text="${this.t(`${this.constructor.is}-warning-modal-message`)}"
        button-text="${this.t(`${this.constructor.is}-warning-modal-button`)}"
        header-close-icon-aria-label="${this.t(`${this.constructor.is}-warning-modal-close-icon`)}"
        header-text="${this.t(`${this.constructor.is}-warning-modal-header`)}"
        link-text="${this.t(`${this.constructor.is}-warning-modal-link`)}"
        modal-type="caution"
        title-icon="${F()}"
        title-text="${this.t(`${this.constructor.is}-warning-modal-title`)}"
        ?visible="${this._showWarningModal}"
        @help-modal-footer-button-click="${t=>{t.stopPropagation(),this._requestSingleUseJws()}}"
        @help-modal-footer-link-click="${this._exitRefundProcess}"
        @help-modal-veil-click="${this._exitRefundProcess}"
        @help-modal-swipe-close="${this._exitRefundProcess}"
        @help-modal-header-click="${this._exitRefundProcess}"
        @modal-state-change="${t=>t.stopPropagation()}"
      >
      </bbva-help-modal>
    `}render(){return f`
      ${this._warningModalTpl}${this._confirmationModalTpl}${this._successVoucherTpl}
      ${this._connectCardReaderTpl}
    `}}var so=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.content {
  text-align: initial;
}

[data-tag-name=bbva-help-modal] {
  z-index: 30;
}

[data-tag-name=bbva-type-text] {
  margin-bottom: 0.5rem;
}

[data-tag-name=bbva-notification-message] {
  margin-top: 2rem;
}
`;class oo extends(D(m(_e(sa(na(_)))))){static get is(){return"payments-mpos-overview-share-voucher-modal"}static get scopedElements(){const t=[kt,Tt,dt,Xa];return oo.scopedElementsFromClasses(t)}static get properties(){return{hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},transactionId:{type:String,attribute:"transaction-id"},type:{type:String},visible:{type:Boolean},_mail:{type:String},_validEmail:{type:Boolean}}}constructor(){super(),this.hasFeatureHeaderHidden=!1,this.transactionId="",this.type="",this.visible=!1,this._mail="",this._validEmail=!1}static get styles(){return[so,st.primaryAlt,$("payments-mpos-overview-share-voucher-modal-shared-styles")]}updated(t){t.forEach(((t,e)=>{"visible"===e&&t!==this[e]&&(this._resetProperties(),(this.visible?()=>this.addView(this):()=>this.closeView(this))())}))}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._boundHandleSuccess=this._handleSuccess.bind(this),document.addEventListener("payments-mpos-overview-share-voucher-success",this._boundHandleSuccess)}disconnectedCallback(){document.removeEventListener("payments-mpos-overview-share-voucher-success",this._boundHandleSuccess),super.disconnectedCallback&&super.disconnectedCallback()}_handleButtonClick(t){t.stopPropagation(),this.sendVoucher({email:this._mail,id:this.transactionId}),this.visible=!1,this._dispatchEvent(`${this.constructor.is}-close`)}_handleSuccess(){this.showNotify(this.t(`${this.constructor.is}-success-message-${this.type}`),"","success")}_resetProperties(){this._mail="",this._validEmail=!1}_setEmail(t){this._validEmail=!0,this._mail=t}get _emailTpl(){return f`
      <payments-mpos-overview-form-email
        info-message="${this.t(`${this.constructor.is}-info-message`)}"
        mail="${this._mail}"
        @payments-mpos-overview-form-email-invalid-set="${()=>{this._validEmail=!1}}"
        @payments-mpos-overview-form-email-valid-set="${({detail:t})=>this._setEmail(t)}"
      >
      </payments-mpos-overview-form-email>
    `}get _mainTpl(){return f` ${this._subtitleTpl}${this._emailTpl} ${this._notificationTpl} `}get _notificationTpl(){return f`
      <bbva-notification-message
        book-title
        message-title="${`${this.constructor.is}-notification-box-message`}"
      ></bbva-notification-message>
    `}get _subtitleTpl(){return f`
      <bbva-type-text
        unset
        size="S"
        text="${this.t(`${this.constructor.is}-subtitle-${this.type}`)}"
      ></bbva-type-text>
    `}render(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t("close-modal")}"
        button-text="${this.t(`${this.constructor.is}-cta-button`)}"
        header-text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-${this.type}`)}"
        hide-content-padding-top
        ?disabled-button="${!this._validEmail}"
        ?visible="${this.visible}"
        .closeModalElements="${["header-right-primary"]}"
        @help-modal-close="${t=>{t.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-close`)}}"
        @help-modal-footer-button-click="${this._handleButtonClick}"
      >
        ${this.visible?f` <div class="content" slot="slot-content">${this._mainTpl}</div> `:""}
      </bbva-help-modal>
    `}}var no=g`
:host {
  display: block;
  box-sizing: border-box;
  --_payments-mpos-overview-sdk-error-modals-panel-info-background-color: var(--payments-mpos-overview-dark-mode-sdk-error-modals-panel-info-background-color, var(--payments-mpos-overview-sdk-error-modals-panel-info-background-color, inherit));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  z-index: 30;
  --bbva-help-modal-footer-padding: 0 1rem 0;
}
[data-tag-name=bbva-help-modal]:not([full-height]) {
  --payments-mpos-overview-dark-mode-panel-info-content-panel-background-color: var(--_payments-mpos-overview-sdk-error-modals-panel-info-background-color);
}

[data-tag-name=bbva-header-category] {
  margin-top: 1rem;
}

[data-tag-name=payments-mpos-overview-panel-info] {
  margin: 1rem 0;
  --payments-mpos-overview-panel-info-content-panel-box-shadow: none;
  --payments-mpos-overview-panel-info-margin-content-text: 0;
  --payments-mpos-overview-panel-info-description-margin: 0.5rem 0;
  --payments-mpos-overview-panel-info-description-padding: 0;
}

[data-tag-name=bbva-type-text] {
  margin-top: 0;
  font-style: ${et("fontStyle",y.book)};
  font-weight: ${et("fontWeight",y.book)};
  font-size: ${et("typeSmall",T)};
  text-align: center;
}
`;const ro={u:t=>`<u>${t}</u>`};class lo extends(tt(m(_e(ra(na(D(_))))))){static get is(){return"payments-mpos-overview-sdk-error-modals"}static get scopedElements(){const t=[kt,dt,ws];return lo.scopedElementsFromClasses(t)}static get properties(){return{hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},isRefund:{type:Boolean,attribute:"is-refund"},isShareLinkVoucher:{type:Boolean,attribute:"is-share-link-voucher"},visible:{type:Boolean},_currentErrorConfig:{type:Object}}}constructor(){super(),this.hasFeatureHeaderHidden=!1,this.isRefund=!1,this.isShareLinkVoucher=!1,this.sdkErrorResponse={},this.visible=!1,this._closeModalElements=["header-right-primary"],this._currentErrorConfig={}}static get styles(){return[no,st.primary,$("payments-mpos-overview-sdk-error-modals-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._boundSetConfigNotControlledError=this._setConfigNotControlledError.bind(this),document.addEventListener("payments-mpos-overview-sdk-not-controlled-error-display",this._boundSetConfigNotControlledError)}disconnectedCallback(){document.removeEventListener("payments-mpos-overview-sdk-not-controlled-error-display",this._boundSetConfigNotControlledError),super.disconnectedCallback&&super.disconnectedCallback()}updated(t){t.forEach(((e,i)=>{"sdkErrorResponse"===i&&e!==this[i]&&Object.keys(this[i]).length&&(this._setModalConfig(),this.clearLoader()),"isShareLinkVoucher"===i&&this[i]&&this._setModalProperties(this._findErrorModel(Ve,_i)),t.has("visible")&&(this.visible?()=>this.addView(this):()=>this.closeView(this))()}))}get _noMoreRetries(){return this._retryErrorCount>=3}_navigateBack(){this._handleModalClose()}_setModalConfig(){const{analyticsEvent:t,code:e,operationType:i}=this.sdkErrorResponse;let a=!1;if(zi({operationType:i,componentName:this.constructor.is,isRefund:this.isRefund}).forEach((t=>{var i;if(!!t.noMoreRetriesModal===this._noMoreRetries&&null!==(i=t.errorCodes)&&void 0!==i&&i.some((({code:t}={})=>e===t))){if(t.analyticsEvent){const{name:e,detail:i}=t.analyticsEvent;this._dispatchEvent(e,i)}if(t.genericErrorMethod)return this[t.genericErrorMethod](),this._handleModalClose(),void(a=!0);this._setModalProperties(t),this._dispatchEvent(`${this.constructor.is}-controlled-error-found`),a=!0}})),!a){if(t){const{name:e,detail:i}=t;this._dispatchEvent(e,i)}else i.includes("execute")&&this._dispatchEvent(`${Fe}-action-footprint`,{view:"charge-fail"});this._openModalSdkNotControlledError()}}_setConfigNotControlledError(t){this._dispatchEvent(`${this.constructor.is}-sdk-not-controlled-open`),this._setModalProperties(t.detail.customErrorData)}_setModalProperties(t){this._currentErrorConfig={...t}}_findErrorModel(t,e){return zi({operationType:e,componentName:this.constructor.is,isRefund:this.isRefund}).find((e=>e.type===t))}_sdkCallsRetryHandler(t,e,i){i&&this.showLoader(oi),this._retryErrorCount=this._noMoreRetries?0:this._retryErrorCount+=1,this._dispatchEvent(t,e)}_handleModalButtonClick(){var t;const e=(null===(t=this._currentErrorConfig)||void 0===t?void 0:t.buttonEvent)||{},{name:i,detail:a,shouldShowSpinner:s}=e;this._sdkCallsRetryHandler(i,a,s)}_handleModalClose(){this._retryErrorCount=0,this._dispatchEvent(`${this.constructor.is}-user-close`)}_handleModalLinkClick(){var t;const e=(null===(t=this._currentErrorConfig)||void 0===t?void 0:t.linkEvent)||{},{name:i,detail:a}=e;this._retryErrorCount=0,this._dispatchEvent(i,a)}_fullHeightModalTpl({buttonText:t="",description:e="",headerText:i="",linkText:a="",microillustration:s="error",panelInfoHeadingTitle:o="3XL",imageSize:n="M",title:r=""}){return f`
      <bbva-help-modal
        aria-label="${this.t(`${this.constructor.is}-settings-help`)}"
        button-text="${this.t(t)}"
        header-close-icon-aria-label="${this.t(`${this.constructor.is}-close-modal`)}"
        header-text="${null!=i&&i.length&&!this.hasFeatureHeaderHidden?this.t(i):""}"
        hide-content-padding-top
        link-text="${this.t(a)}"
        fixed-footer
        full-height
        ?visible="${this.visible}"
        .closeModalElements="${this._closeModalElements}"
        @help-modal-footer-button-click="${t=>this._handleModalButtonClick(t)}"
        @help-modal-footer-link-click="${t=>this._handleModalLinkClick(t)}"
        @help-modal-veil-click="${()=>this._handleModalClose()}"
        @help-modal-header-click="${()=>this._handleModalClose()}"
      >
        <div slot="slot-content">
          <payments-mpos-overview-panel-info
            content-title="${this.t(r)}"
            heading-level-title="${o}"
            description="${this.t(e,ro)}"
            microillustration="${s}"
            image-size="${n}"
          >
          </payments-mpos-overview-panel-info>
        </div>
      </bbva-help-modal>
    `}_halfHeightModalTpl({buttonText:t="",description:e="",linkText:i="",microillustration:a="error",panelInfoHeadingTitle:s="3XL",imageSize:o="M",title:n=""}){return f`
      <bbva-help-modal
        aria-label="${this.t(`${this.constructor.is}-settings-help`)}"
        button-text="${this.t(t)}"
        header-close-icon-aria-label="${this.t(`${this.constructor.is}-close-modal`)}"
        header-text="${this.t(`${this.constructor.is}-default-header-text`)}"
        hide-content-padding-top
        link-text="${this.t(i)}"
        .closeModalElements="${this._closeModalElements}"
        ?visible="${this.visible}"
        @help-modal-footer-button-click="${t=>this._handleModalButtonClick(t)}"
        @help-modal-footer-link-click="${t=>this._handleModalLinkClick(t)}"
        @help-modal-veil-click="${()=>this._handleModalClose()}"
        @help-modal-header-click="${()=>this._handleModalClose()}"
      >
        <div slot="slot-content">
          <payments-mpos-overview-panel-info
            content-title="${this.t(n)}"
            heading-level-title="${s}"
            description="${this.t(e,ro)}"
            microillustration="${a}"
            image-size="${o}"
          >
          </payments-mpos-overview-panel-info>
        </div>
      </bbva-help-modal>
    `}render(){const{fullHeight:t}=this._currentErrorConfig;return t?this._fullHeightModalTpl(this._currentErrorConfig):this._halfHeightModalTpl(this._currentErrorConfig)}}var co=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}
`;const ho={PAYMENT_LINK:"payment-link-create",PRESENT_CARD:"execute-charge"};class po extends(D(P(Qi(m(_e(sa(ka(fa(la(wa(_))))))))))){static get is(){return"payments-mpos-overview-charge-zone"}static get scopedElements(){const t=[Ts,Na,us,Es,Ns,js,ao,oo,lo];return po.scopedElementsFromClasses(t)}static get properties(){return{commission:{type:Number},executedChargeData:{type:Object,attribute:"executed-charge-data"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},isCalculatorVisible:{type:Boolean,attribute:"is-calculator-visible",reflect:!0},isRefundCancelled:{type:Boolean,attribute:"is-refund-cancelled"},isTopReady:{type:Boolean,attribute:"is-top-ready"},language:{type:String},redirectUrl:{type:String,attribute:"redirect-url"},sdkErrorResponse:{type:Object,attribute:"sdk-error-response"},generatedPaymentLink:{type:Object,attribute:"generated-payment-link"},singleUseJws:{type:String,attribute:"single-use-jws"},taxTypes:{type:Array,attribute:"tax-types"},_chargeMethods:{type:Array},_isConnectCardReaderVisible:{type:Boolean},_isSdkErrorModalVisible:{type:Boolean},_operationType:{type:String},_productList:{type:Array},_isPresentCard:{type:Boolean},_isPaymentLink:{type:Boolean},_isTapOnPhone:{type:Boolean},_shouldChangeChargeMethod:{type:Boolean},_showCancelLinkReceipt:{type:Boolean},_showRefundHandler:{type:Boolean},_isCardReaderSettingsVisible:{type:Boolean}}}static get styles(){return[co,$("payments-mpos-overview-charge-zone-shared-styles")]}constructor(){super(),this.commission=0,this.executedChargeData={},this.hasFeatureHeaderHidden=!1,this.generatedPaymentLink={},this.isCalculatorVisible=!1,this.isRefundCancelled=!1,this.isTopReady=!1,this.language="",this.redirectUrl="",this.sdkErrorResponse={},this.singleUseJws="",this.taxTypes=[],this._chargeMethods=[],this._executedChargeOrderId="",this._handleCancelLinkSuccess=this._handleCancelLinkSuccess.bind(this),this._isCardReaderSettingsVisible=!1,this._isConnectCardReaderVisible=!1,this._isPaymentLink=!1,this._isPresentCard=!1,this._isTapOnPhone=!1,this._isSdkErrorModalVisible=!1,this._merchant=this.getSelectedMerchant()||{},this._method="",this._operationData={},this._operationType="",this._productList=[],this._refundData={},this._shouldChangeChargeMethod=!1,this._showCancelLinkReceipt=!1,this._showRefundHandler=!1,this._showRefundScanDevicesModal=!1,this._spinnerMessage=""}connectedCallback(){super.connectedCallback&&super.connectedCallback(),document.addEventListener("payments-mpos-overview-cancel-link-success",this._handleCancelLinkSuccess)}disconnectedCallback(){document.removeEventListener("payments-mpos-overview-cancel-link-success",this._handleCancelLinkSuccess),super.disconnectedCallback&&super.disconnectedCallback()}firstUpdated(){this._checkAvailableChargeMethods(),this.isCalculatorVisible=!0}updated(t){t.forEach(((t,e)=>{"executedChargeData"===e&&t!==this[e]&&Object.keys(this[e]).length&&(this.clearLoader(),this._handleSDKResponse(),this._isConnectCardReaderVisible=!1),"isRefundCancelled"===e&&t!==this[e]&&this[e]&&(this._showRefundHandler=!this.isRefundCancelled),"isTopReady"===e&&this.isTopReady&&this._checkAvailableChargeMethods()}))}_chargeAgain(){this.isCalculatorVisible=!0,this._productList=[],this._isPaymentLink=!1,this._isPresentCard=!1,this._isTapOnPhone=!1,this._showRefundHandler=!1}_checkAvailableChargeMethods(){if(Object.keys(this._merchant).length){const t=this.isTopReady?this._merchant.products:this._merchant.products.filter((t=>t.id!==ni.TAP_ON_PHONE.id));this._chargeMethods=t.flatMap((t=>t.paymentMethods.map((e=>({id:t.id===ni.TAP_ON_PHONE.id?t.id:e.id,name:t.id===ni.TAP_ON_PHONE.id?t.id:e.name}))))).sort(((t,e)=>fi.indexOf(t.id)-fi.indexOf(e.id)))}}_handleCancelLinkSuccess(){this._showCancelLinkReceipt=!0}_handleCloseMultiStep(){this.isCalculatorVisible=!1,this._productList=[]}_shareReceipt(t){const{detail:e}=t,i=this.generateDataToReceipt({data:e});this._dispatchEvent("payments-mpos-overview-receipt-share",i)}_handleExecuteCharge(){this._executedChargeOrderId=Bi(),this._operationData.orderId=this._executedChargeOrderId,this["executeCharge"+(this._operationType===ni.PRESENT_CARD.id?"":"Top")](this._operationData)}_handleMultistepComplete(t){switch(this._operationData=t.detail,this._operationType=this._operationData.paymentMethod,this._method=ho[this._operationType],this._operationType){case ni.PRESENT_CARD.id:this._isConnectCardReaderVisible=!0;break;case ni.TAP_ON_PHONE.id:this._handleSDKResponse(),this._handleExecuteCharge();break;case ni.PAYMENT_LINK.id:this._handleSDKResponse(),this._spinnerMessage=this.t(`${this.constructor.is}-creating-link`),this._operationData.redirectUrl=this.redirectUrl,this.createPaymentLink(this._operationData)}}_handleSDKResponse(){this[`_${`IS_${this._operationType}`.toLowerCase().replace(/[^a-zA-Z0-9]+(.)/g,((t,e)=>e.toUpperCase()))}`]=!0}_handleDeviceConnectionSuccess(){this._handleExecuteCharge()}get _cancelLinkReceipt(){return Object.keys(this.generatedPaymentLink).length?f`
          <payments-mpos-overview-cancelled-link-receipt
            commission="${this.commission}"
            ?visible="${this._showCancelLinkReceipt}"
            .merchantData="${this._merchant}"
            .operationData="${{...this.generatedPaymentLink,...this._operationData}}"
            @payments-mpos-overview-cancelled-link-receipt-state-reset="${()=>{this.generatedPaymentLink={}}}"
          ></payments-mpos-overview-cancelled-link-receipt>
        `:""}get _calculatorTpl(){return f`
      <payments-mpos-overview-calculator
        iva="${this.selectedIva}"
        merchant-name="${this._merchant.name}"
        language="${this.language}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${this.isCalculatorVisible}"
        .currencyCode="${this.currencyCode}"
        .localCurrency="${this.localCurrency}"
        @payments-mpos-overview-calculator-cta-button-click="${({detail:{products:t}})=>{this._productList=t}}"
        @help-modal-close="${t=>{t.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-close`)}}"
      ></payments-mpos-overview-calculator>
    `}get _connectCardReaderTpl(){var t;return f`
      <payments-mpos-overview-connect-card-reader-modal
        ?is-card-reader-settings-visible="${this._isCardReaderSettingsVisible}"
        ?visible="${this._isConnectCardReaderVisible}"
        .defaultDevice="${null===(t=this.getSelectedMerchant())||void 0===t?void 0:t.cardReaderDevice}"
        @payments-mpos-overview-connect-card-reader-modal-connection-success="${()=>this._handleDeviceConnectionSuccess()}"
        @payments-mpos-overview-connect-card-reader-modal-new-device-select="${({detail:t})=>{this._dispatchEvent(`${this.constructor.is}-put-user-settings`,{cardReaderDevice:t})}}"
        @payments-mpos-overview-connect-card-reader-modal-charge-method-change="${()=>{this._shouldChangeChargeMethod=!0,this._isConnectCardReaderVisible=!1,this._isCardReaderSettingsVisible=!1}}"
        @payments-mpos-overview-connect-card-reader-modal-close="${()=>{this._isConnectCardReaderVisible=!1,this._isCardReaderSettingsVisible=!1}}"
      >
      </payments-mpos-overview-connect-card-reader-modal>
    `}get _multistepTpl(){return this._productList.length?f`
          <payments-mpos-overview-multistep
            expiration-days="${this.expirationDays}"
            commission="${this.commission}"
            language="${this.language}"
            ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
            .chargeMethods="${this._chargeMethods}"
            .currencyCode="${this.currencyCode}"
            .taxTypes="${this.taxTypes}"
            .localCurrency="${this.localCurrency}"
            .productList="${this._productList}"
            .shouldChangeChargeMethod="${this._shouldChangeChargeMethod}"
            @payments-mpos-overview-step-summary-calculator-navigate="${()=>{this.isCalculatorVisible=!0,this._productList=[]}}"
            @payments-mpos-overview-multistep-complete="${this._handleMultistepComplete}"
            @payments-mpos-overview-multistep-charge-method-change="${()=>{this._shouldChangeChargeMethod=!1}}"
            @payments-mpos-overview-multistep-close="${this._handleCloseMultiStep}"
          ></payments-mpos-overview-multistep>
        `:""}get _chargeReceiptTpl(){var t,e;return f`
      <payments-mpos-overview-card-reader-receipt
        card-reader-device-id="${null===(t=this.getSelectedMerchant())||void 0===t||null===(e=t.cardReaderDevice)||void 0===e?void 0:e.name}"
        commission="${this.commission}"
        currency-code="${this.currencyCode}"
        language="${this.language}"
        local-currency="${this.localCurrency}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${!(!this._isPresentCard&&!this._isTapOnPhone||!Object.keys(this.executedChargeData).length)}"
        .merchant="${this._merchant}"
        .openpayData="${this.executedChargeData}"
        .operationData="${this._operationData}"
        @payments-mpos-overview-card-reader-receipt-charge="${this._chargeAgain}"
        @payments-mpos-overview-card-reader-receipt-cancel-charge="${t=>{this._refundData={...t.detail,orderId:this._executedChargeOrderId},this._showRefundHandler=!0}}"
        @payments-mpos-overview-card-reader-receipt-receipt-share="${this._shareReceipt}"
        @payments-mpos-overview-card-reader-receipt-payment-voucher-share="${()=>this._handleShareVoucherModalVisibility(Ne,this.executedChargeData.id)}"
      ></payments-mpos-overview-card-reader-receipt>
    `}get _linkReceiptTpl(){return f`
      <payments-mpos-overview-link-receipt
        commission="${this.commission}"
        currency-code="${this.currencyCode}"
        expiration-days="${this.expirationDays}"
        language="${this.language}"
        local-currency="${this.localCurrency}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${!(!this._isPaymentLink||!Object.keys(this.generatedPaymentLink).length)}"
        .merchant="${this._merchant}"
        .openpayData="${this.generatedPaymentLink}"
        .operationData="${this._operationData}"
        @payments-mpos-overview-link-receipt-charge="${this._chargeAgain}"
        @payments-mpos-overview-link-receipt-link-cancel="${()=>{this._spinnerMessage="",this.cancelPaymentLink({linkId:this.generatedPaymentLink.id,status:je,expirationDate:this.generatedPaymentLink.expirationDate})}}"
        @payments-mpos-overview-link-receipt-receipt-share="${this._shareReceipt}"
        @payments-mpos-overview-link-receipt-state-reset="${()=>{this.generatedPaymentLink={}}}"
      ></payments-mpos-overview-link-receipt>
    `}get _refundHandlerTpl(){return f`
      <payments-mpos-overview-refund-handler
        commission="${this.commission}"
        currency-code="${this.currencyCode}"
        language="${this.language}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?is-card-reader-settings-visible="${this._showRefundScanDevicesModal}"
        ?visible="${this._showRefundHandler}"
        .singleUseJws="${this.singleUseJws}"
        .transactionData="${this._refundData}"
        @payments-mpos-overview-refund-receipt-modal-charge="${this._chargeAgain}"
        @payments-mpos-overview-refund-handler-refund-cancel="${()=>{this._showRefundHandler=!1,this._isCardReaderSettingsVisible=!1}}"
        @payments-mpos-overview-refund-receipt-modal-voucher-share="${()=>this._handleShareVoucherModalVisibility(He,this._refundData.id)}"
        @payments-mpos-overview-card-reader-settings-close="${()=>{this._showRefundHandler=!1,this._isCardReaderSettingsVisible=!1}}"
        @payments-mpos-overview-refund-receipt-modal-receipt-share="${this._shareReceipt}"
      ></payments-mpos-overview-refund-handler>
    `}get _shareVoucherTpl(){return f`
      <payments-mpos-overview-share-voucher-modal
        transaction-id="${this.transactionId}"
        type="${this._shareVoucherType}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${this._isShareVoucherModalVisible}"
        @payments-mpos-overview-share-voucher-modal-close="${()=>{this._isShareVoucherModalVisible=!1}}"
      >
      </payments-mpos-overview-share-voucher-modal>
    `}get _sdkErrorModalsTpl(){return f`
      <payments-mpos-overview-sdk-error-modals
        ?is-refund="${this._showRefundHandler}"
        ?visible="${this._isSdkErrorModalVisible}"
        .sdkErrorResponse="${this.sdkErrorResponse}"
        @payments-mpos-overview-sdk-error-modals-sdk-not-controlled-open="${()=>{this._isSdkErrorModalVisible=!0}}"
        @payments-mpos-overview-sdk-error-modals-close="${()=>{this._isSdkErrorModalVisible=!1}}"
        @payments-mpos-overview-sdk-error-modals-retry-execute-charge-call="${()=>{this._isSdkErrorModalVisible=!1,this._handleExecuteCharge()}}"
        @payments-mpos-overview-sdk-error-modals-retry-canceled-charge-call="${()=>{this._isSdkErrorModalVisible=!1,this._handleExecuteCharge()}}"
        @payments-mpos-overview-sdk-error-modals-retry-new-devices-scan-call="${()=>{this._isSdkErrorModalVisible=!1,this.scanNewDevices()}}"
        @payments-mpos-overview-sdk-error-modals-retry-connect-to-bluetooth-device-call="${()=>{this.connectToBluetoothDevice(),this._isSdkErrorModalVisible=!1}}"
        @payments-mpos-overview-sdk-error-modals-payment-method-change="${()=>{this._shouldChangeChargeMethod=!0,this._isConnectCardReaderVisible=!1,this._isCardReaderSettingsVisible=!1,this._isSdkErrorModalVisible=!1}}"
        @payments-mpos-overview-sdk-error-modals-new-devices-scan="${()=>{this._isCardReaderSettingsVisible=!0,this._isSdkErrorModalVisible=!1}}"
        @payments-mpos-overview-sdk-error-modals-retry-scan-devices-call="${()=>{this.scanNewDevices(),this._isSdkErrorModalVisible=!1}}"
        @payments-mpos-overview-phone-settings-open="${()=>{this._isSdkErrorModalVisible=!1,this._shouldChangeChargeMethod=!0,this._isConnectCardReaderVisible=!1}}"
        @payments-mpos-overview-sdk-error-modals-controlled-error-found="${()=>{this._isSdkErrorModalVisible=!0}}"
        @payments-mpos-overview-sdk-error-modals-user-close="${t=>{this._showRefundHandler&&(t.stopPropagation(),this._showRefundHandler=!1,this._isConnectCardReaderVisible=!1,this._isSdkErrorModalVisible=!1)}}"
        @payments-mpos-overview-sdk-error-modals-refund-new-devices-scan="${()=>{this._showRefundScanDevicesModal=!0,this._isSdkErrorModalVisible=!1}}"
        @payments-mpos-overview-sdk-error-modals-common-top-init-error="${()=>{this._isSdkErrorModalVisible=!1}}"
        @payments-mpos-overview-sdk-error-modals-emv-limit-exceeded="${()=>{this._isSdkErrorModalVisible=!1}}"
      >
      </payments-mpos-overview-sdk-error-modals>
    `}render(){return f`
      ${this._calculatorTpl} ${this._multistepTpl} ${this._chargeReceiptTpl} ${this._linkReceiptTpl}
      ${this._connectCardReaderTpl}${this._cancelLinkReceipt}
      ${this._refundHandlerTpl}${this._shareVoucherTpl}${this._sdkErrorModalsTpl}
    `}}var mo=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-type-text] {
  color: ${et("colorPrimaryText02Default",it)};
  text-align: left;
  margin-bottom: 1rem;
}

[data-tag-name=bbva-list-bullet] {
  padding-left: 0;
  padding-right: 0;
}
`;const uo=["text-a","text-b","text-c"];class vo extends(D(_e(m(na(_))))){static get is(){return"payments-mpos-overview-last-charges-modal"}static get scopedElements(){const t=[kt,Bt,dt];return vo.scopedElementsFromClasses(t)}static get properties(){return{hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},visible:{type:Boolean},_lastChargesModalTexts:{type:Array}}}constructor(){super(),this.hasFeatureHeaderHidden=!1,this.visible=!1,this._lastChargesModalTexts=[]}updated(t){t.has("visible")&&(this.visible?()=>{this.addView(this),this._lastChargesModalTexts=uo}:()=>this.closeView(this))()}static get styles(){return[mo,It.primaryAlt,st.primaryAlt,$("payments-mpos-overview-last-charges-modal-shared-styles")]}render(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t(`${this.constructor.is}-close`)}"
        aria-label="${this.t(`${this.constructor.is}`)}"
        fixed-footer
        full-height
        header-text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-header`)}"
        header-type="modal"
        title-icon="${E()}"
        title-text="${this.t(`${this.constructor.is}-title`)}"
        ?visible="${this.visible}"
        @help-modal-close="${t=>{t.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-close`),this.visible=!1}}"
      >
        <div slot="slot-content">
          <bbva-type-text
            unset
            size="S"
            text="${this.t(`${this.constructor.is}-subtitle`)}"
          ></bbva-type-text>
          ${this._lastChargesModalTexts.map((t=>{const e=this.t(`${this.constructor.is}-${t}`);return f`
              ${e!==`${this.constructor.is}-${t}`?f` <bbva-list-bullet disabled-tabindex text="${e}"></bbva-list-bullet> `:f``}
            `}))}
        </div>
      </bbva-help-modal>
    `}}const go="Canceled",bo="start",yo="end",_o=t((t=>class extends t{static get properties(){return{datePickerErrorMessage:{type:String},endDate:{type:String},endDateError:{type:Boolean},startDate:{type:String},startDateError:{type:Boolean}}}constructor(){super(),this.endDate="",this.endDateError=!1,this.datePickerErrorMessage="",this.startDate="",this.startDateError=!1}onDatePickerRangeDataChange(t){const{selectedDate:e,type:i,origin:a}=t;if(`${this.constructor.is}-${this.searchType}`===a){this.datePickerErrorMessage=this.t(`${this.constructor.is}-native-datepicker-error-range-exceeded`,{fromDate:this.fromDate}),this.endDateError=!1,this.startDateError=!1,this.startDate=i===bo?e:this.startDate,this.endDate=i===yo?e:this.endDate,Ai(this.startDate,this.endDate)&&(this.endDate=Pi());const t=((t,e,i)=>{const a=i?moment(i):moment(),s=moment(e).diff(a,"days");return Math.abs(s)>t})(this.fromDate,this.startDate,this.endDate);this.startDateError=t&&i===bo,this.endDateError=t&&i===yo}}onDatePickerInputDataChange(t){const{selectedDate:e}=t;this._newExpirationDate=e,this._isDatepickerError=!1}onDatePickerRangeErrorChange(t){const{type:e,origin:i,message:a}=t;`${this.constructor.is}-${this.searchType}`===i&&a!==go&&(this.datePickerErrorMessage=this.t(`${this.constructor.is}-native-datepicker-error`),this.startDateError=e===bo||this.startDateError,this.endDateError=e===yo||this.endDateError)}onDatePickerInputErrorChange(t){const{message:e}=t;e!==go&&(this._newExpirationDate="",this._isDatepickerError=!0)}handleDateRangeEvent(t){t.preventDefault();const{id:e}=t.composedPath()[0],i=e.split("-")[0],a=Pi();let s=a,o=this.startDate,n={};this.endDate||(this.endDate=Pi()),this.constructor.is===`${Fe}-search-movements`&&(n={defaultDate:"start"===i?this.startDate:this.endDate,origin:`${this.constructor.is}-${this.searchType}`,type:i}),this.constructor.is===`${Fe}-edit-link-date-modal`?(o=a,s=null,n={defaultDate:this._newExpirationDate||(Ai(this.expirationDate,a)?a:this.expirationDate)}):"start"===i&&(o=null),this.dispatchEvent(new CustomEvent(`${Fe}-native-datepicker-open`,{bubbles:!0,composed:!0,detail:{dateFormat:"yyyy-MM-dd",maxDate:s,minDate:o,...n}}))}}));var $o=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  z-index: 20;
  --bbva-help-modal-padding: 0;
}

.content {
  padding: 0 1rem;
}
`;class fo extends(D(m(sa(_o(na(_)))))){static get is(){return"payments-mpos-overview-edit-link-date-modal"}static get scopedElements(){const t=[Nt,kt,dt];return fo.scopedElementsFromClasses(t)}static get properties(){return{datePickerData:{type:Object,attribute:"date-picker-data"},datePickerError:{type:Object,attribute:"date-picker-error"},expirationDate:{type:String,attribute:"expiration-date"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},language:{type:String},transactionId:{type:String,attribute:"transaction-id"},visible:{type:Boolean},_isDatepickerError:{type:Boolean},_newExpirationDate:{type:String}}}static get styles(){return[$o,Ht.primaryAlt,st.primaryAlt,$("payments-mpos-overview-edit-link-date-modal-shared-styles")]}constructor(){super(),this.datePickerData={},this.datePickerError={},this.expirationDate="",this.hasFeatureHeaderHidden=!1,this.language="",this.transactionId="",this.visible=!1,this._isDatepickerError=!1,this._newExpirationDate=""}updated(t){t.forEach(((t,e)=>{"visible"===e&&((this.visible?()=>this.addView(this):()=>this.closeView(this))(),this[e]&&this.expirationDate&&(this.expirationDate=Ei(this.expirationDate,this.language,fe))),this.visible&&("datePickerData"===e&&t!==this[e]&&Object.keys(this[e]).length&&this.onDatePickerInputDataChange(this.datePickerData),"datePickerError"===e&&t!==this[e]&&Object.keys(this[e]).length&&this.onDatePickerInputErrorChange(this.datePickerError))}))}_handleChangeDate(){const t={status:Ue,expirationDate:this._newExpirationDate,linkId:this.transactionId};this.updatePaymentLink({newLinkData:t,origin:this}),this._handleExitModal()}_handleExitModal(){this.visible=!1,this._newExpirationDate="",this._isDatepickerError=!1,this._dispatchEvent(`${this.constructor.is}-close`)}get _dateInputTpl(){return f`
      <bbva-form-input
        info-message="${this.t(`${this.constructor.is}-input-message`)}"
        error-message="${this.datePickerErrorMessage}"
        label="${this.t(`${this.constructor.is}-input-label`)}"
        type="date"
        ?required="${this._isDatepickerError}"
        .value="${this._isDatepickerError||this._newExpirationDate?this._newExpirationDate:this.expirationDate}"
        @input="${this._handleInput}"
        @click="${t=>t.preventDefault()}"
        @touchstart="${this.handleDateRangeEvent}"
      ></bbva-form-input>
    `}render(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t(`${this.constructor.is}-modal-close`)}"
        aria-label="${this.t(`${this.constructor.is}-modal-info`)}"
        button-text="${this.t(`${this.constructor.is}-button-text`)}"
        header-text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-header-title`)}"
        hide-content-padding-top
        ?disabled-button="${!this._newExpirationDate.length}"
        ?visible="${this.visible}"
        @help-modal-close="${t=>{t.stopPropagation(),this._handleExitModal()}}"
        @help-modal-footer-button-click="${t=>{t.stopPropagation(),this._handleChangeDate()}}"
      >
        ${this.visible?f`
              <div class="content" slot="slot-content">
                <bbva-type-text
                  text="${`${this.constructor.is}-description-text`}"
                  size="S"
                ></bbva-type-text>
                ${this._dateInputTpl}
              </div>
            `:""}
      </bbva-help-modal>
    `}}var ko=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=payments-mpos-overview-item-detail] {
  --bbva-type-date-color: ${et("colorPrimaryAltText01Default",it)};
}

[data-tag-name=bbva-notification-message] {
  margin: 0.5rem 1rem;
}
[data-tag-name=bbva-notification-message][variant=error] {
  text-align: left;
}

[data-tag-name=payments-mpos-overview-panel-info] {
  --payments-mpos-overview-panel-info-microillustration-width: 6.875rem;
  --payments-mpos-overview-panel-info-content-panel-box-shadow: none;
  margin: 1.5rem 1rem;
}

.last-charges-header {
  margin: 0 0 0 1rem;
}

.operations-list__list {
  margin: 0;
  padding: 0;
  list-style: none;
}
.operations-list__divider:first-child {
  display: none;
}
.operations-list__date {
  background-color: var(--payments-mpos-overview-dark-mode-background-color, var(--payments-mpos-overview-background-color, ${et("colorPrimarySurfaceAmbientDefault",it)}));
  padding: 1rem 0 0 1rem;
  z-index: 9;
  position: sticky;
}
.operations-list__date--first {
  margin-top: 0;
}
.operations-list__date--disabled-header {
  top: 0;
}

:host([is-filtered]) .operations-list__date {
  top: 5.5rem;
}
:host([is-filtered]) .operations-list__date--disabled-header {
  top: 3.5rem;
}

.fit {
  padding-left: 1rem;
  padding-right: 1rem;
}
`;const wo="creationDate",xo="operationDate",To={day:"2-digit",month:"long",year:"numeric",timeZone:"UTC"};j("operations-list-shared-styles",g`
    ${ko}
  `);class So extends(D(m(_e(ra(_))))){static get is(){return"payments-mpos-overview-operations-list"}static get scopedElements(){const t=[xt,Dt,Zt,Tt,As,ws];return So.scopedElementsFromClasses(t)}static get properties(){return{hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},hasMoreElements:{type:Boolean,attribute:"has-more-elements"},fromDate:{type:String,attribute:"from-date"},isFiltered:{type:Boolean,attribute:"is-filtered"},isLinkManagement:{type:Boolean,attribute:"is-link-management"},isSearchById:{type:Boolean,attribute:"is-search-by-id"},language:{type:String},lastChargesHeaderEnabled:{type:Boolean,attribute:"last-charges-header-enabled"},limit:{type:Number},loading:{type:Boolean},offset:{type:Number},operationsList:{type:Array,attribute:"operations-list"},_isListTransactionsError:{type:Boolean},shouldResetErrorProps:{type:Boolean,attribute:"should-reset-error-props"},_maxRetrysReached:{type:Boolean},_operationsListFormatted:{type:Object},_openingSwipeId:{type:Array}}}static get styles(){return[ko,wt.primaryAlt,Ct.primaryAlt,Kt.primaryAlt,$(`${So.is}-shared-styles`)]}constructor(){super(),this.fromDate="",this.hasFeatureHeaderHidden=!1,this.hasMoreElements=!1,this.isFiltered=!1,this.isLinkManagement=!1,this.isSearchById=!1,this.limit=0,this.language="",this.lastChargesHeaderEnabled=!1,this.loading=!1,this.offset=0,this.operationsList=[],this.shouldResetErrorProps=!1,this._dateToUse="",this._hasFetchedData=!1,this._isListTransactionsError=!1,this._maxRetrysReached=!1,this._operationsListFormatted={},this._openingSwipeId=[],this._retryErrorCount=0,this._observer=new IntersectionObserver((t=>this._handleNewRequestIntersection.call(this,t)))}firstUpdated(){this.hasMoreElements=!0,this._dateToUse=this.isLinkManagement?wo:xo,this._operationEntity=this.isLinkManagement?ei:ti,this.loading=!0}updated(t){t.forEach(((t,e)=>{"dashboardTransactionsListFailed"===e&&this.dashboardTransactionsListFailed&&(this._isListTransactionsError=!0,this.loading=!1,this._dispatchEvent(`${this.constructor.is}-error-prop-reset`)),"shouldResetErrorProps"===e&&this.shouldResetErrorProps&&this._resetErrorProp(),"operationsList"===e&&t!==this[e]&&(this._hasFetchedData=!0,this._formatOperationsList(),this._handleObserveLastItem()),"hasMoreElements"!==e||t===this[e]||this[e]||(this.loading=!1),"loading"!==e||this.loading||this._dispatchEvent(`${this.constructor.is}-loading-stop`),"_retryErrorCount"===e&&(this._maxRetrysReached=3===this._retryErrorCount)}))}get _showNoDataTpl(){return this._hasFetchedData&&!this.loading&&!this.operationsList.length&&!this._isListTransactionsError}get _showNotification(){return this._hasFetchedData&&!this.isFiltered&&!this.hasMoreElements}_formatOperationsList(){var t,e,i;this._operationsListFormatted=(t=this.operationsList,e=this._dateToUse,i=fe,[...t].map((t=>({...t,[`${e}_formatted`]:moment(t[e]).format(i)})))),this._operationsListFormatted=((t,e)=>t.reduce(((t,i)=>t[i[e]]?{...t,[i[e]]:(t[i[e]].push(i),t[i[e]])}:{...t,[i[e]]:[i]}),[]))(this._operationsListFormatted,`${this._dateToUse}_formatted`)}_getBadgeDescription(t){return"completed"===t||"refund"===t?"":this.t(`${this.constructor.is}-${t}`)}_getSubtitleText(t,e){return this.isLinkManagement?t.name:`${this.constructor.is}-${e.toLowerCase()}`}_handleNewRequestIntersection(t){var e;null!==(e=t[0])&&void 0!==e&&e.isIntersecting&&!this.loading&&this.hasMoreElements&&(this.loading=!0,this._dispatchEvent(`${this.constructor.is}-more-operations-request`,{offset:this.offset+this.limit,limit:this.limit}),this._observer.disconnect())}async _handleObserveLastItem(){await this.updateComplete;const t=this.shadowRoot.querySelector("#last-item");t&&(this._observer.observe(t),this.loading=!1)}_handleOperativeAction(t,e){const i={transactionDetail:e,..."see-more"===t?{actions:ii[this._operationEntity][e.status.toLowerCase()]}:{}};this._dispatchEvent(`${this.constructor.is}-${t}`,i)}get _skeletonSize(){return this.operationsList.length?1:7}_getSwipeActions(t){let e=ii[this._operationEntity][t];return e=Hi(e,this),e.length>3&&(e=e.slice(0,2),e.push({icon:W(),label:this.t(`${this.constructor.is}-see-more`),action:"see-more"})),e}_handleListTransactionsRetry(){this._maxRetrysReached?this.openCallAction():(this._retryErrorCount+=1,this.loading=!0,this._isListTransactionsError=!1,this.operationsList=[],this._dispatchEvent(`${this.constructor.is}-retry-list-transactions-call`)),this._dispatchEvent(`${this.constructor.is}-error-prop-reset`)}_resetErrorProp(){this._isListTransactionsError=!1,this._retryErrorCount=0,this._dispatchEvent(`${this.constructor.is}-error-prop-reset`)}_checkSwipe(t,e){this._openingSwipeId=[t,e]}_checkOpeningSwipeStatus(t,e){return this._openingSwipeId&&this._openingSwipeId[0]===t&&this._openingSwipeId[1]===e&&Ke}get _notificationTpl(){return this._showNotification&&!this._isListTransactionsError?f`
          <bbva-notification-message
            .message="${this.t(`${this.constructor.is}-notification-message`,{fromDate:this.fromDate})}"
            message-title="${this.t(`${this.constructor.is}-notification-title`)}"
            link-title="${this.t(`${this.constructor.is}-notification-link`)}"
            variant="caution"
            @notification-message-link-click="${()=>this._dispatchEvent(`${this.constructor.is}-search-movements-navigate`)}"
          ></bbva-notification-message>
        `:""}get lastMovementsHeaderTpl(){return!this._isListTransactionsError&&this.lastChargesHeaderEnabled?f`
          <bbva-header-category
            class="last-charges-header"
            has-help
            heading-level="2"
            link-accessibility-text="${this.t(`${this.constructor.is}-last-charges`)}"
            text="${this.t(`${this.constructor.is}-last-charges`)}"
            ?loading="${this.loading}"
            @header-category-help-click="${t=>{t.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-last-charges-modal-open`)}}"
          ></bbva-header-category>
        `:""}get _operationsListTpl(){const t=[];return this._operationsListFormatted&&Object.entries(this._operationsListFormatted).length>0&&Object.keys(this._operationsListFormatted).forEach(((e,i,a)=>t.push(f`
          <ul class="operations-list__list">
            <li>
              <bbva-header-category
                class="operations-list__date ${L({"operations-list__date--first":0===i,"operations-list__date--disabled-header":this.hasFeatureHeaderHidden})}"
                date="${e}"
                font-weight-date="500"
                font-style-date="italic"
                locale="${this.language}"
                variant="date"
                .options="${To}"
              ></bbva-header-category>
              ${this._operationsListFormatted[e].map((({amount:t,creationDate:e,currency:s,customer:o,description:n,id:r,payment_method_name:l,status:d,statusLowerCase:c=d.toLowerCase()},h,p)=>f`
                  <bbva-list-swipe
                    .opening=${this._checkOpeningSwipeStatus(i,h)}
                    .operativeActions="${this._getSwipeActions(c)}"
                    @bbva-list-swipe-track-left=${()=>this._checkSwipe(i,h)}
                    @list-swipe-action-click="${({detail:{item:{action:t}}})=>this._handleOperativeAction(t,p[h])}"
                  >
                    <payments-mpos-overview-item-detail
                      amount-type="${"completed"===c?"income":""}"
                      amount="${t}"
                      badge="${this._getBadgeDescription(c)}"
                      badge-type="${ze[c]}"
                      currency-code="${s}"
                      date="${e}"
                      ellipsis
                      heading="${n}"
                      id="${i===a.length-1&&h===p.length-1?"last-item":""}"
                      language="${this.language}"
                      link
                      local-currency="${s}"
                      second-subtitle="${this.t(`${this.constructor.is}-id`,{id:r})}"
                      slot="invoker"
                      subtitle="${this._getSubtitleText(o,l)}"
                      tabindex="-1"
                      @click="${()=>{this._dispatchEvent(`${this.constructor.is}-operation-click`,{actions:Hi(ii[this._operationEntity][c],this),transactionDetail:p[h]})}}"
                    ></payments-mpos-overview-item-detail>
                  </bbva-list-swipe>
                  ${h!==p.length-1?f`
                        <div class="fit">
                          <bbva-divider-default></bbva-divider-default>
                        </div>
                      `:""}
                `))}
            </li>
          </ul>
        `))),f` ${t} `}get _getNoDataLiteral(){return this.isSearchById?this.t(`${this.constructor.is}-no-transactions-filtered-search-by-id`):this.isFiltered?this.t(`${this.constructor.is}-no-transactions-filtered`):this._operationEntity===ei?this.t(`${this.constructor.is}-no-transactions-filtered-link`):this.t(`${this.constructor.is}-no-transactions-in-range-days`,{fromDate:this.fromDate})}get _getNoDataDescription(){return this.isSearchById?this.t(`${this.constructor.is}-no-transactions-filtered-search-by-id-text`):this.isFiltered?this.t(`${this.constructor.is}-no-transactions-filtered-text`):this._operationEntity===ei?this.t(`${this.constructor.is}-no-transactions-filtered-link-text`):this.t(`${this.constructor.is}-no-transactions-in-range-days-text`)}get _noDataTpl(){return this._showNoDataTpl?f`
          <payments-mpos-overview-panel-info
            content-title="${this._getNoDataLiteral}"
            description="${this._getNoDataDescription}"
            heading-level-title="3XL"
            microillustration="emptystateday"
            image-size="M"
          >
          </payments-mpos-overview-panel-info>
        `:""}get _listTransactionsErrorTpl(){return!this.loading&&this._isListTransactionsError?f`
          <bbva-notification-message
            variant="error"
            message-title="${this.t(`${this.constructor.is}-transactions-error-message-title`)}"
            link-title="${this._maxRetrysReached?this.t(`${this.constructor.is}-transactions-error-max-retrys-link-text`):this.t(`${this.constructor.is}-transactions-error-link-text`)}"
            message="${this._maxRetrysReached?this.t(`${this.constructor.is}-transactions-error-max-retrys-message`):this.t(`${this.constructor.is}-transactions-error-message`)}"
            @notification-message-link-click="${()=>this._handleListTransactionsRetry()}"
          >
          </bbva-notification-message>
        `:f``}get _skeletonTpl(){return f`
      <div class="skeleton-loading-container">
        ${this.loading?new Array(this._skeletonSize).fill(this._skeletonSize).map((()=>f`
                <payments-mpos-overview-item-detail loading></payments-mpos-overview-item-detail>
                <div class="fit">
                  <bbva-divider-default></bbva-divider-default>
                </div>
              `)):""}
        ${!this.loading||this.operationsList.length||this._isListTransactionsError?"":f`
              <bbva-notification-message loading variant="caution"></bbva-notification-message>
            `}
      </div>
    `}render(){return f`
      ${this.lastMovementsHeaderTpl}${this._noDataTpl}${this._operationsListTpl}
      ${this._skeletonTpl} ${this._notificationTpl}${this._listTransactionsErrorTpl}
    `}}const Co=t((t=>class extends t{static get properties(){return{pageSize:{type:Number,attribute:"page-size"}}}constructor(){super(),this.pageSize=10,this._pagination={limit:this.pageSize,offset:0}}get pagination(){return{...this._pagination,limit:this.pageSize}}resetPagination(){this._pagination={limit:this.pageSize,offset:0}}updatePagination(t){this._pagination={...t}}}));var Do=g`
:host {
  display: block;
  box-sizing: border-box;
  --_payments-mpos-overview-search-results-form-filter-link-color: var(--payments-mpos-overview-dark-mode-search-results-form-filter-link-color, var(--payments-mpos-overview-search-results-form-filter-link-color, ${et("colorSecondaryAltLinkMainDefault",it)}));
  --_payments-mpos-overview-search-results-form-filter-link-color-active: var(--payments-mpos-overview-dark-mode-search-results-form-filter-link-color-active, var(--payments-mpos-overview-search-results-form-filter-link-color-active, ${et("colorPrimarySurfaceContrastDefault",it)}));
  --bbva-transition-container--custom--primary-ambient--content-bg-color: ${et("colorPrimarySurfaceAmbientDefault",it)};
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
}
[data-tag-name=bbva-transition-container] [slot=slot-content] {
  position: relative;
  z-index: 0;
}

[data-tag-name=bbva-form-filter] {
  --bbva-form-filter-dark-mode-gradient-color: 0;
  --bbva-type-link-dark-mode-color: var(--_payments-mpos-overview-search-results-form-filter-link-color);
  --bbva-type-link-active-dark-mode-color: var(--_payments-mpos-overview-search-results-form-filter-link-color-active);
  background-color: ${et("colorPrimarySurfaceAmbientDefault",it)};
  height: initial;
  padding-inline: 1rem;
  position: sticky;
  z-index: 20;
  padding-top: 1rem;
  top: 0;
}

.disabled-header {
  top: 0;
}

.loading-content {
  display: inline-grid;
  height: 80vh;
}
.loading-content__spinner {
  display: grid;
  align-self: center;
}
`;class Eo extends(_e(D(sa(m(na(fa(Co(_)))))))){static get is(){return"payments-mpos-overview-search-results"}static get properties(){return{fromDate:{type:String,attribute:"from-date"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},isLinkManagement:{type:Boolean,attribute:"is-link-management"},isSearchById:{type:Boolean,attribute:"is-search-by-id"},language:{type:String},linksList:{type:Array,attribute:"links-list"},refundResquestStatus:{type:Object,attribute:"refund-request-status"},searchFilters:{type:Object,attribute:"search-filters"},_filters:{type:Array},_visible:{type:Boolean},_resultsFilter:{type:Object}}}static get scopedElements(){const t=[ie,Pt,So];return Eo.scopedElementsFromClasses(t)}constructor(){super(),this.fromDate="",this.hasFeatureHeaderHidden=!1,this.isLinkManagement=!1,this.isSearchById=!1,this.language="",this.linksList=[],this.refundResquestStatus={},this.searchFilters={},this._defaultEventsTransitionContainer=[],this._filters=[],this._visible=!1,this._resultsFilter={}}static get styles(){return[Do,ee.primaryAlt,$("payments-mpos-overview-search-results-shared-styles")]}firstUpdated(){this._retrieveData=this.isLinkManagement?this.paymentLinkListing:this.listTransactions}updated(t){t.forEach(((t,e)=>{"refundResquestStatus"===e&&this.refundResquestStatus.requester===this.constructor.is&&this.refundResquestStatus.success&&this._refreshOperationsList(),"_visible"===e&&(this._visible?()=>this.addView(this):()=>this.closeView(this))();const i="operationsList"===e&&this.operationsList.length&&t!==this[e],a="linksList"===e&&this.linksList.length&&t!==this[e],s="hasMoreElements"===e&&t!==this[e]&&!this[e];if((i||s||a)&&(this.clearLoader(),this._visible=!0),"searchFilters"===e&&t!==this[e])if(this.isSearchById){const{operationId:t}=this.searchFilters;this._filters=[{name:t,removable:!0,value:t}],this.callSdkByOperationId({operationId:t[0]})}else{const{startDate:t,endDate:e,checked:i}=this.searchFilters;if(this._filters=i.map((t=>({name:this.t(`${this.constructor.is}-${t.toLowerCase()}`),removable:!0,value:t}))),t&&e){const i=`${Ei(t,this.language,we)} - ${Ei(e,this.language,we)}`;this._filters.push({name:i,removable:!0,dates:{startDate:t,endDate:e}})}this._resultsFilter={operationGte:t||Li(this.fromDate),operationLte:e||Pi(),...this._checkboxSelection(this.searchFilters.checked)},this.operationsList=[],this.linksList=[],this.isLinkManagement||this._dispatchEvent(`${this.constructor.is}-transactions-list-filtered-get`),this.resetPagination(),this._retrieveData({...this.pagination,...this._resultsFilter}),this.hasMoreElements=!0,this.showLoader()}}))}get _onIconClickActions(){return[()=>{this._visible=!1,this._dispatchEvent(`${this.constructor.is}-close`)},()=>this._handleOnMenuIconClick({payload:Eo.is})]}_checkboxSelection(t){return this.isLinkManagement?{status:t}:{productTypes:t.map((t=>hi[t]))}}_handleOnCloseFilter(t){if(this._filters=this._filters.filter(((e,i)=>i!==t.detail)),this._filters.length){if(!this.isSearchById){const t=this._filters.find((t=>t.dates)),e=this._filters.filter((t=>t.value)).map((t=>t.value));this.operationsList=[],this.linksList=[],this.showLoader(),this._resultsFilter={operationGte:(null==t?void 0:t.dates.startDate)||Li(this.fromDate),operationLte:(null==t?void 0:t.dates.endDate)||Pi(),...this._checkboxSelection(e)},this.resetPagination(),this._retrieveData({...this.pagination,...this._resultsFilter}),this._dispatchEvent(`${this.constructor.is}-filter-close`,{methods:e,dateFilters:t})}}else this._dispatchEvent(`${this.constructor.is}-all-filters-remove`)}_refreshOperationsList(){this.showLoader(),this.operationsList=[],this.hasMoreElements=!0,this.resetPagination(),this._retrieveData({...this._resultsFilter,...this.pagination})}_resetFilters(){this._filters=[],this._handleOnCloseFilter()}_shareReceipt(t){let{detail:{transactionDetail:e}={}}=t??{};e=e||this.transactionDetail;const i=this.generateDataToReceipt({data:e});this._dispatchEvent("payments-mpos-overview-receipt-share",i)}get _headerMainButtons(){return[{id:`${this.constructor.is}-btn-menu`,icon:J(),accessibilityText:this.t(`${this.constructor.is}-menu`)}]}get _operationsTpl(){return f`
      <bbva-transition-container
        header-show-left-icon
        header-text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-search-results`)}"
        header-type="first-level-sequential"
        ?visible="${this._visible}"
        .closeModalIndex="${this._defaultEventsTransitionContainer}"
        .headerButtons="${this._headerMainButtons}"
        @header-main-icon-click="${t=>{const{index:e}=t.detail;t.stopPropagation(),this._onIconClickActions[e]()}}"
        @transition-container-close="${t=>{t.stopPropagation(),this._visible=!1}}"
      >
        <div slot="slot-content">
          <bbva-form-filter
            editable-label="${this.t(`${this.constructor.is}-edit`)}"
            header-title="${this.t(`${this.constructor.is}-header-title`)}"
            class="${L({"disabled-header":this.hasFeatureHeaderHidden})}"
            clear-label="${this.t(`${this.constructor.is}-delete`)}"
            .filters="${this._filters}"
            @form-filter-close-click="${this._handleOnCloseFilter}"
            @form-filter-clear-click="${this._resetFilters}"
            @header-category-link-click="${()=>this._dispatchEvent(`${this.constructor.is}-edit-click`)}"
          >
          </bbva-form-filter>
          <payments-mpos-overview-operations-list
            is-filtered
            language="${this.language}"
            limit="${this.pagination.limit}"
            offset="${this.pagination.offset}"
            ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
            ?is-link-management="${this.isLinkManagement}"
            ?is-search-by-id="${this.isSearchById}"
            .hasMoreElements="${!!this.hasMoreElements}"
            .operationsList="${this.isLinkManagement?this.linksList:this.operationsList}"
            @payments-mpos-overview-operations-list-receipt-share="${this._shareReceipt}"
            @payments-mpos-overview-operations-list-more-operations-request="${t=>{this.updatePagination(t.detail),this._retrieveData({...this.pagination,...this._resultsFilter})}}"
          >
          </payments-mpos-overview-operations-list>
        </div>
      </bbva-transition-container>
    `}render(){return f` ${this._operationsTpl} `}}var Mo=g`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-type-date-color: ${et("colorPrimaryAltText01Default",it)};
  --bbva-type-text-color: var(--bbva-type-date-color);
  --_payments-mpos-overview-search-movements-header: ${et("colorPrimaryAltText01Default",it)};
  --_payments-mpos-overview-search-movements-header-color: var(--payments-mpos-overview-search-movements-header-color-dark-mode,var(--_payments-mpos-overview-search-movements-header));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-header-category] {
  padding-left: 1rem;
  --bbva-header-category--_ambient--heading-color: var(--_payments-mpos-overview-search-movements-header-color);
}

[data-tag-name=bbva-form-date-range] {
  margin-bottom: 0.5rem;
  --bbva-type-text--_ambient-spotlight-color: var(--_payments-mpos-overview-search-movements-header-color);
}

[data-tag-name=bbva-type-text] {
  margin: 1rem 0 1rem 0;
  padding-left: 1rem;
  text-align: left;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.check-boxes-options {
  list-style: none;
  padding: 0;
  text-align: left;
  margin: 1rem 0;
}
`;const Po={"payment-methods":"paymentMethods","link-statuses":"linkStatuses"};class Lo extends(D(m(_e(na(_o(_)))))){static get is(){return"payments-mpos-overview-search-movements"}static get scopedElements(){const t=[Ft,te,Dt,kt,dt,Eo];return Lo.scopedElementsFromClasses(t)}static get properties(){return{datePickerData:{type:Object,attribute:"date-picker-data"},datePickerError:{type:Object,attribute:"date-picker-error"},fromDate:{type:String,attribute:"from-date"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},language:{type:String},linkStatuses:{type:Array,attribute:"link-statuses"},pageSize:{type:Number,attribute:"page-size"},paymentMethods:{type:Array,attribute:"payment-methods"},refundResquestStatus:{type:Object,attribute:"refund-request-status"},searchType:{type:String,attribute:"search-type"},visible:{type:Boolean},_checkboxOptions:{type:Array},_openResultsView:{type:Boolean}}}static get styles(){return[Mo,Qt.primaryAlt,Ot.primaryAlt,Ct.primaryAlt,st.primaryAlt,$("payments-mpos-overview-search-movements-shared-styles")]}constructor(){super(),this.datePickerData={},this.datePickerError={},this.fromDate="",this.hasFeatureHeaderHidden=!1,this.language="",this.linkStatuses=[],this.pageSize=10,this.paymentMethods=[],this.refundResquestStatus={},this.searchType="",this.visible=!1,this._checkboxOptions=[],this._openResultsView=!1,this._search={},this._isUserEditing=!1}firstUpdated(){this._checkboxOptions=this._getCheckboxOptions(Po[this.searchType]),this.startDate=Li(this.fromDate)}updated(t){t.forEach(((t,e)=>{"visible"===e&&(this.visible?()=>this.addView(this):()=>this.closeView(this))(),"visible"===e&&this[e]&&!this._isUserEditing&&(this.startDate=Li(this.fromDate)),this.visible&&("datePickerData"===e&&t!==this[e]&&Object.keys(this[e]).length&&this.onDatePickerRangeDataChange(this.datePickerData),"datePickerError"===e&&t!==this[e]&&Object.keys(this[e]).length&&this.onDatePickerRangeErrorChange(this.datePickerError))}))}_getCheckboxOptions(t){return this[t].map((t=>({label:`${this.constructor.is}-${t.replaceAll("_","-").toLowerCase()}`,value:`${t}`,isChecked:!1})))}_handleResultsClick(){const t=this._checkboxOptions.filter((t=>t.isChecked)).map((t=>t.value));this._search={checked:t,endDate:this.startDate&&!this.endDate?Pi():this.endDate,startDate:this.startDate?this.startDate:Li(this.fromDate)},this._openResultsView=!0,this.visible=!1}_handleCheckboxClick(t,e){const{checked:i}=t.target;this._checkboxOptions[e].isChecked=i}_handleFilterClose(t){const{dateFilters:e,methods:i}=t.detail;this._checkboxOptions=this._checkboxOptions.map((t=>i.includes(t.value)?{...t,isChecked:!0}:{...t,isChecked:!1})),e||(this.endDate="",this.startDate="")}_checkBoxesOptions(t,e){return f`
      <bbva-form-checkbox
        divider-size="${this._checkboxOptions.length-1!==e?"full":""}"
        label="${this.t(t.label)}"
        value="${t.value}"
        ?checked="${t.isChecked}"
        @change="${t=>this._handleCheckboxClick(t,e)}"
      >
      </bbva-form-checkbox>
    `}_headerCategoryTpl(t){return f`
      <bbva-header-category
        heading-level="2"
        text="${this.t(`${this.constructor.is}-${t}`)}"
      ></bbva-header-category>
    `}_resetFilters(){this._checkboxOptions=this._getCheckboxOptions(Po[this.searchType]),this.endDate="",this.endDateError=!1,this._isUserEditing=!1,this._search={},this.startDate="",this.startDateError=!1}get _checkBoxesTpl(){return this.visible?f`
          ${this._headerCategoryTpl(`checkboxes-header-${this.searchType}`)}
          <ul class="check-boxes-options">
            ${this._checkboxOptions.map(((t,e)=>f`
                <li>${this._checkBoxesOptions(t,e)}</li>
              `))}
          </ul>
        `:""}get _datePickerTpl(){return f`
      ${this._headerCategoryTpl("date")}
      <bbva-form-date-range
        end-text="${this.t(`${this.constructor.is}-end-text`)}"
        end-title-text="${this.t(`${this.constructor.is}-end-title-text`)}"
        error-message="${this.datePickerErrorMessage}"
        start-text="${this.t(`${this.constructor.is}-start-text`)}"
        start-title-text="${this.t(`${this.constructor.is}-start-title-text`)}"
        utc
        ?start-error="${this.startDateError}"
        ?end-error="${this.endDateError}"
        .locale="${this.language}"
        .endDate="${this.endDate}"
        .startDate="${this.startDate}"
        @click="${t=>t.preventDefault()}"
        @touchstart="${this.handleDateRangeEvent}"
      ></bbva-form-date-range>
    `}get _resultsTpl(){return this._openResultsView?f`
          <payments-mpos-overview-search-results
            language="${this.language}"
            ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
            ?is-link-management="${!!this.linkStatuses.length}"
            .fromDate="${this.fromDate}"
            .pageSize="${this.pageSize}"
            .refundResquestStatus="${this.refundResquestStatus}"
            .searchFilters="${this._search}"
            @payments-mpos-overview-search-results-all-filters-remove="${()=>{this.visible=!0,this._isUserEditing=!0,this._resetFilters()}}"
            @payments-mpos-overview-search-results-edit-click="${()=>{this.visible=!0,this._isUserEditing=!0}}"
            @payments-mpos-overview-search-results-close="${()=>{this._openResultsView=!1,this._resetFilters(),this._dispatchEvent(`${this.constructor.is}-close`)}}"
            @payments-mpos-overview-search-results-filter-close="${this._handleFilterClose}"
          ></payments-mpos-overview-search-results>
        `:""}get _searchMovementsTpl(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t(`${this.constructor.is}-modal-close`)}"
        aria-label="${this.t(`${this.constructor.is}-modal-info`)}"
        button-text="${this.t(`${this.constructor.is}-button-text`)}"
        fixed-footer
        full-height
        header-text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-header-title-${this.searchType}`)}"
        header-type="modal"
        hide-content-padding-top
        hide-padding-left
        ?disabled-button="${this.startDateError||this.endDateError}"
        ?visible="${this.visible}"
        @help-modal-header-click="${t=>{t.stopPropagation(),this._openResultsView=!1,this.visible=!1,this._dispatchEvent(`${this.constructor.is}-close`),this._resetFilters()}}"
        @help-modal-footer-button-click="${()=>this._handleResultsClick()}"
      >
        <div class="content" slot="slot-content">
          <bbva-type-text
            unset
            size="S"
            text="${this.t(`${this.constructor.is}-modal-subtitle`)}"
          ></bbva-type-text>
          ${this._datePickerTpl} ${this._checkBoxesTpl}
        </div>
      </bbva-help-modal>
    `}render(){return f` ${this._resultsTpl}${this._searchMovementsTpl} `}}var Ro=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.content {
  text-align: initial;
}

[data-tag-name=bbva-type-text] {
  margin: 1rem 0;
  text-align: left;
}
`;class Io extends(D(m(_e(na(_))))){static get is(){return"payments-mpos-overview-search-sales-by-id"}static get scopedElements(){const t=[Nt,kt,Eo,dt];return Io.scopedElementsFromClasses(t)}static get properties(){return{fromDate:{type:String,attribute:"from-date"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},language:{type:String},visible:{type:Boolean},_inputInfoMessage:{type:Boolean},_isValidInput:{type:Boolean},_operationId:{type:String},_openResultsView:{type:Boolean}}}static get styles(){return[Ro,Ht.primaryAlt,st.primaryAlt,$("payments-mpos-overview-search-sales-by-id-shared-styles")]}constructor(){super(),this.fromDate="",this.hasFeatureHeaderHidden=!1,this.language="",this.visible=!1,this._inputInfoMessage=!1,this._isValidInput=!1,this._operationId="",this._openResultsView=!1,this._search={}}updated(t){t.forEach(((t,e)=>{"_operationId"===e&&t!==this[e]&&(this._isValidInput=20===this._operationId.length,this._inputInfoMessage=this._operationId.length>20),"visible"===e&&(this.visible?()=>this.addView(this):()=>this.closeView(this))()}))}handleResultsClick(){this._search={operationId:[this._operationId]},this.visible=!1,this._openResultsView=!0}_handleInput(t){const{value:e}=t.composedPath()[0];this._operationId=e}get _resultsTpl(){return this._openResultsView?f`
          <payments-mpos-overview-search-results
            language="${this.language}"
            is-search-by-id
            .fromDate="${this.fromDate}"
            .searchFilters="${this._search}"
            @payments-mpos-overview-search-results-edit-click="${()=>{this.visible=!0,this._openResultsView=!1}}"
            @payments-mpos-overview-search-results-close="${()=>{this._openResultsView=!1,this._operationId="",this._dispatchEvent(`${this.constructor.is}-close`)}}"
            @payments-mpos-overview-operations-list-operation-click="${t=>{t.stopPropagation();const{detail:e}=t;this._dispatchEvent(`${this.constructor.is}-operation-click`,e)}}"
          ></payments-mpos-overview-search-results>
        `:""}get _idInputTpl(){return f`
      <bbva-form-input
        ambient="primary-alt"
        error-message="${this.t(`${this.constructor.is}-error-message`)}"
        pattern="${"^[A-Za-z0-9]{1,20}$"}"
        auto-validate
        info-message="${this._inputInfoMessage?"":this.t(`${this.constructor.is}-info-message`)}"
        label="${this.t(`${this.constructor.is}-input-label`)}"
        type="text"
        value="${this._operationId}"
        @form-field-input-clear="${t=>{this._operationId="",this._handleInput(t)}}"
        @input="${this._handleInput}"
      ></bbva-form-input>
    `}render(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t(`${this.constructor.is}-modal-close`)}"
        aria-label="${this.t(`${this.constructor.is}-modal-info`)}"
        button-text="${this.t(`${this.constructor.is}-button-text`)}"
        header-text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-header-title`)}"
        hide-content-padding-top
        ?disabled-button="${!this._isValidInput}"
        ?visible="${this.visible}"
        @help-modal-close="${t=>{t.stopPropagation(),this.visible=!1,this._operationId="",this._dispatchEvent(`${this.constructor.is}-close`)}}"
        @help-modal-footer-button-click="${this.handleResultsClick}"
      >
        <div class="content" slot="slot-content">
          <bbva-type-text
            unset
            size="S"
            text="${this.t(`${this.constructor.is}-modal-subtitle`)}"
          ></bbva-type-text>
          ${this._idInputTpl}
        </div>
      </bbva-help-modal>
      ${this._resultsTpl}
    `}}var Ao=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.content {
  text-align: initial;
}

.modal-content {
  padding: 0 1rem;
}

.three-items-row {
  margin-top: 0.5rem;
}

.one-item-row-container {
  max-width: 33%;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

[data-tag-name=bbva-header-category] {
  padding-left: 0;
  padding-bottom: 1rem;
}

[data-tag-name=payments-mpos-overview-item-link] {
  padding-inline: 0;
}

[data-tag-name=bbva-divider-default]:last-of-type {
  display: none;
}
`;class Vo extends(D(_e(m(na(_))))){static get is(){return"payments-mpos-overview-see-more-actions"}static get scopedElements(){const t=[xt,kt,ja];return Vo.scopedElementsFromClasses(t)}static get properties(){return{actions:{type:Array},visible:{type:Boolean}}}constructor(){super(),this.actions=[],this.visible=!1}updated(t){t.forEach(((t,e)=>{"visible"===e&&(this.visible?()=>this.addView(this):()=>{this.closeView(this),this._dispatchEvent(`${this.constructor.is}-close`)})()}))}static get styles(){return[Ao,wt.primaryAlt,$("payments-mpos-overview-see-more-actions-shared-styles")]}_handleActionClick(t){this._dispatchEvent(`${this.constructor.is}-choose-action`,{action:t.action})}get _actionsTpl(){return f`
      ${this.actions.map((t=>f`
          <payments-mpos-overview-item-link
            clip-icon="${t.icon}"
            header-text="${this.t(`${this.constructor.is}-${t.action}`)}"
            @payments-mpos-overview-item-link-click="${()=>this._handleActionClick(t)}"
          >
          </payments-mpos-overview-item-link>
          <bbva-divider-default></bbva-divider-default>
        `))}
    `}render(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t(`${this.constructor.is}-close-modal`)}"
        aria-label="${this.t(`${this.constructor.is}-operate-modal`)}"
        header-text="${this.t(`${this.constructor.is}-operate`)}"
        hide-content-padding-top
        ?visible="${this.visible}"
        @help-modal-close="${t=>{t.stopPropagation(),this.currentSelectedOption=this._currentSavedValue,this.visible=!1,this._dispatchEvent(`${this.constructor.is}-close`)}}"
      >
        <div class="modal-content" slot="slot-content">${this._actionsTpl}</div>
      </bbva-help-modal>
    `}}var Bo=g`
/* stylelint-disable */
:host {
  display: block;
  box-sizing: border-box;
  --bbva-transition-container-padding: 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-button-row] {
  --bbva-button-action-dark-mode-color: var(--payments-mpos-overview-dark-mode-button-row-color);
  --bbva-button-action-active-dark-mode-color: var(--payments-mpos-overview-dark-mode-active-button-row-color);
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--payments-mpos-overview-background-color);
}
[data-tag-name=bbva-transition-container] [slot=slot-content] {
  z-index: 0;
  position: relative;
}

[data-tag-name=bbva-help-modal][modal-type=caution] {
  z-index: 20;
}
`;const Oo=["available","processed","expired","cancelled"],Fo={"date-edit":"isEditLinkDateVisible","link-cancel":"showCancelLinkWarning"};class Ho extends(D(P(m(_e(sa(Qi(na(fa(Co(_)))))))))){static get is(){return"payments-mpos-overview-manage-links"}static get properties(){return{commission:{type:Number},datePickerData:{type:Object,attribute:"date-picker-data"},datePickerError:{type:Object,attribute:"date-picker-error"},filterTypeStatusLink:{type:Array,attribute:"filter-type-status-link"},fromDate:{type:String,attribute:"from-date"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},isEditLinkDateVisible:{type:Boolean,attribute:"is-edit-link-date-visible"},language:{type:String},refundResquestStatus:{type:Object,attribute:"refund-request-status"},showCancelLinkWarning:{type:Boolean,attribute:"show-cancel-link-warning"},visible:{type:Boolean},_isSearchLinksVisible:{type:Boolean},_isTransactionActionsVisible:{type:Boolean},_isOperationListLoading:{type:Boolean},_showCancelLinkReceipt:{type:Boolean}}}static get scopedElements(){const t=[Mt,kt,Yt,Pt,Ts,So,fo,Lo,Io,Vo];return Ho.scopedElementsFromClasses(t)}static get styles(){return[Bo,$("payments-mpos-overview-manage-links-shared-styles"),Et.primaryAlt,Xt.primaryAlt]}constructor(){super(),this.commission=0,this.datePickerData={},this.datePickerError={},this.filterTypeStatusLink=[],this.fromDate="",this.hasFeatureHeaderHidden=!1,this.isEditLinkDateVisible=!1,this.language="",this.refundResquestStatus={},this.showCancelLinkWarning=!1,this.visible=!1,this._disableDefaultEvents=[],this._handleCancelLinkSuccess=this._handleCancelLinkSuccess.bind(this),this._isOperationListLoading=!1,this._isSearchLinksVisible=!1,this._isTransactionActionsVisible=!1,this._listFilters={},this._showCancelLinkReceipt=!1,this._toastMessage="",this._transactionActions=[]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._isOperationListLoading=!0,document.addEventListener("payments-mpos-overview-cancel-link-success",this._handleCancelLinkSuccess)}disconnectedCallback(){document.removeEventListener("payments-mpos-overview-cancel-link-success",this._handleCancelLinkSuccess),super.disconnectedCallback&&super.disconnectedCallback()}updated(t){t.forEach((async(t,e)=>{"_isOperationListLoading"!==e||this[e]||(this._isOperationListLoading=!0),"visible"===e&&(this.visible?()=>this.addView(this):()=>this.closeView(this))(),"refundResquestStatus"===e&&this.refundResquestStatus.requester===this.constructor.is&&this.refundResquestStatus.success&&this._refreshLinksList()}))}get _onIconClickActions(){return[()=>{this.visible=!1,this._dispatchEvent(`${this.constructor.is}-close`)},()=>this._handleOnMenuIconClick({payload:this.constructor.is})]}_handleCancelLink(){this.cancelPaymentLink({linkId:this.transactionDetail.id,status:je,expirationDate:this.transactionDetail.expirationDate})}_handleCancelLinkSuccess(){this._showCancelLinkReceipt=!0,this._refreshLinksList();const t=Hi(ii[ei].cancelled,this);this._dispatchEvent(`${this.constructor.is}-update-transaction-actions`,t)}_handleChooseAction(t){const{detail:{action:e}}=t;"payment-link-send"===e?this._sendLink():"receipt-share"===e?this._shareReceipt():this[Fo[e]]=!0,this._isTransactionActionsVisible=!1}_handleEditLinkDateSuccess(){this._refreshLinksList(),this._toastMessage=this.t(`${this.constructor.is}-toast-success-message`),this.showNotify(this._toastMessage,"","success")}_handleTabChange(t){this.linksList=[],this._isOperationListLoading=!1;const{detail:{selectedIndex:e}}=t;this._currentStatusFilter=Oo[e],this.resetPagination(),this._listFilters={operationGte:Li(this.fromDate),operationLte:Pi(),status:[this._currentStatusFilter]},this.paymentLinkListing({...this.pagination,...this._listFilters})}_handleTransactionActions(t){const{detail:{actions:e,transactionDetail:i}}=t;this.transactionDetail=i,this._transactionActions=[...e],this._isTransactionActionsVisible=!0}_refreshLinksList(){this._isOperationListLoading=!1,this.linksList=[],this.resetPagination(),this.paymentLinkListing({...this._listFilters,...this.pagination})}_shareReceipt(t){let{detail:{transactionDetail:e}={}}=t??{};e=e||this.transactionDetail;const i=this.generateDataToReceipt({data:e});this._dispatchEvent("payments-mpos-overview-receipt-share",i)}_sendLink(t){const{detail:{transactionDetail:e}={}}=t??{},{checkoutLink:i,amount:a,currency:s}=e||this.transactionDetail,o=`${u(s,s)} ${a.toFixed(2)}`,n=this.getSelectedMerchant().name;this._dispatchEvent("payments-mpos-overview-payment-link-send",this.t("payments-mpos-overview-payment-link-msg",{link:i,paymentAmount:o,merchant:n}))}get _buttonRowTpl(){const t=[{icon:d(),label:this.t(`${this.constructor.is}-button-search`)}];return f`
      <bbva-button-row
        variant="simple"
        .options="${t}"
        @button-row-item-click="${()=>{this._isSearchLinksVisible=!0}}"
      ></bbva-button-row>
    `}get _cancelLinkReceipt(){return f`
      <payments-mpos-overview-cancelled-link-receipt
        commission="${this.commission}"
        currency-code="${this.currencyCode}"
        ?visible="${this._showCancelLinkReceipt}"
        .merchantData="${this.getSelectedMerchant()}"
        .operationData="${this.generatedPaymentLink}"
        @payments-mpos-overview-cancelled-link-receipt-exit-receipt="${()=>{this._showCancelLinkReceipt=!1}}"
        @payments-mpos-overview-cancelled-link-receipt-manage-links-navigate="${()=>{this.navigateBackTo("manage-links"),this._isTransactionActionsVisible=!1,this._showCancelLinkReceipt=!1}}"
      ></payments-mpos-overview-cancelled-link-receipt>
    `}get _cancelLinkWarningModal(){return f`
      <bbva-help-modal
        aria-label="${this.t(`${this.constructor.is}-warning-modal`)}"
        body-text="${this.t(`${this.constructor.is}-cancel-link-warning-body`)}"
        button-text="${this.t(`${this.constructor.is}-cancel-link-warning-button`)}"
        class="warning-modal"
        header-text="${this.t(`${this.constructor.is}-cancel-link-warning-header-text`)}"
        link-text="${this.t(`${this.constructor.is}-cancel-link-warning-link`)}"
        modal-type="caution"
        title-icon="${F()}"
        title-text="${this.t(`${this.constructor.is}-cancel-link-warning-title-text`)}"
        ?visible="${this.showCancelLinkWarning}"
        @help-modal-footer-button-click="${this._handleCancelLink}"
        @help-modal-close="${t=>{t.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-close-warning-modal`),this.showCancelLinkWarning=!1}}"
        @modal-state-change="${t=>t.stopPropagation()}"
      >
      </bbva-help-modal>
    `}get _editLinkDateModalTpl(){return f`
      <payments-mpos-overview-edit-link-date-modal
        expiration-date="${this.transactionDetail.expirationDate}"
        language="${this.language}"
        transaction-id="${this.transactionDetail.id}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${this.isEditLinkDateVisible}"
        .datePickerData="${this.datePickerData}"
        .datePickerError="${this.datePickerError}"
        @payments-mpos-overview-edit-link-date-modal-close="${()=>{this.isEditLinkDateVisible=!1}}"
        @payments-mpos-overview-edit-link-date-success="${()=>this._handleEditLinkDateSuccess()}"
      >
      </payments-mpos-overview-edit-link-date-modal>
    `}get _headerMainButtons(){return[{id:`${this.constructor.is}-btn-menu`,icon:J(),accessibilityText:this.t(`${this.constructor.is}-global-menu`)}]}get _operationListTpl(){return this._isOperationListLoading?f`
          <payments-mpos-overview-operations-list
            is-link-management
            language="${this.language}"
            limit="${this.pagination.limit}"
            offset="${this.pagination.offset}"
            ?loading="${this._isOperationListLoading}"
            .fromDate="${this.fromDate}"
            .hasMoreElements="${this.hasMoreElements}"
            .operationsList="${this.linksList}"
            @payments-mpos-overview-operations-list-more-operations-request="${t=>{this.updatePagination(t.detail),this._listFilters={status:this._currentStatusFilter?[this._currentStatusFilter]:[],operationGte:Li(this.fromDate),operationLte:Pi()},this.paymentLinkListing({...this.pagination,...this._listFilters})}}"
            @payments-mpos-overview-operations-list-receipt-share="${this._shareReceipt}"
            @payments-mpos-overview-operations-list-search-movements-navigate="${()=>{this._isSearchLinksVisible=!0}}"
            @payments-mpos-overview-operations-list-see-more="${t=>this._handleTransactionActions(t)}"
            @payments-mpos-overview-operations-list-payment-link-send="${t=>this._sendLink(t)}"
          >
          </payments-mpos-overview-operations-list>
        `:""}get _tabDefaultTpl(){const t=[{title:`${this.constructor.is}-tab-available`},{title:`${this.constructor.is}-tab-processed`},{title:`${this.constructor.is}-tab-expired`},{title:`${this.constructor.is}-tab-cancelled`}];return f`
      <bbva-tab-default
        id="tab-default"
        selected="0"
        accessibility-text="Available sections"
        .options="${t}"
        @tab-default-tab-change="${this._handleTabChange}"
      >
        <div
          id="content-0"
          tabindex="0"
          role="tabpanel"
          aria-labelledby="${this.t(`${this.constructor.is}-available`)}"
        >
          ${this._operationListTpl}
        </div>
        <div
          id="content-1"
          tabindex="0"
          role="tabpanel"
          aria-labelledby="${this.t(`${this.constructor.is}-processed`)}"
        >
          ${this._operationListTpl}
        </div>
        <div
          id="content-2"
          tabindex="0"
          role="tabpanel"
          aria-labelledby="${this.t(`${this.constructor.is}-expired`)}"
        >
          ${this._operationListTpl}
        </div>
        <div
          id="content-3"
          tabindex="0"
          role="tabpanel"
          aria-labelledby="${this.t(`${this.constructor.is}-cancelled`)}"
        >
          ${this._operationListTpl}
        </div>
      </bbva-tab-default>
    `}get _searchMovementsModalTpl(){return f`
      <payments-mpos-overview-search-movements
        language="${this.language}"
        search-type="link-statuses"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${this._isSearchLinksVisible}"
        .datePickerData="${this.datePickerData}"
        .datePickerError="${this.datePickerError}"
        .fromDate="${this.fromDate}"
        .linkStatuses="${this.filterTypeStatusLink}"
        .pageSize="${this.pageSize}"
        @help-modal-close="${t=>{t.stopPropagation(),this._isSearchLinksVisible=!1}}"
        @payments-mpos-overview-operations-list-see-more="${t=>this._handleTransactionActions(t)}"
      >
      </payments-mpos-overview-search-movements>
    `}get _seeMoreTransactionActionsTpl(){return f`
      <payments-mpos-overview-see-more-actions
        ?visible="${this._isTransactionActionsVisible}"
        .actions="${this._transactionActions}"
        @payments-mpos-overview-see-more-actions-choose-action="${this._handleChooseAction}"
        @payments-mpos-overview-see-more-actions-close="${()=>{this._isTransactionActionsVisible=!1}}"
      >
      </payments-mpos-overview-see-more-actions>
    `}render(){return f`
      <bbva-transition-container
        header-show-left-icon
        header-text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-header-text`)}"
        header-type="first-level-sequential"
        reset-scroll
        ?visible="${this.visible}"
        .closeModalIndex="${this._disableDefaultEvents}"
        .headerButtons="${this._headerMainButtons}"
        @header-main-icon-click="${t=>{const{index:e}=t.detail;t.stopPropagation(),this._onIconClickActions[e]()}}"
        @transition-container-close="${t=>{t.stopPropagation()}}"
      >
        ${this.visible&&f` <div slot="slot-content">${this._buttonRowTpl} ${this._tabDefaultTpl}</div> `}
      </bbva-transition-container>
      ${this._searchMovementsModalTpl} ${this._seeMoreTransactionActionsTpl}
      ${this._editLinkDateModalTpl} ${this._cancelLinkReceipt} ${this._cancelLinkWarningModal}
    `}}var No=g`
:host {
  display: block;
  position: relative;
  --_payments-mpos-overview-list-offer-card-info-brackground-color: var(--payments-mpos-overview-list-offer-card-info-brackground-color, inherit);
  --_payments-mpos-overview-list-offer-card-box-shadow: var(--payments-mpos-overview-list-offer-card-box-shadow, ${et("type1",G)});
  --_payments-mpos-overview-list-offer-skeleton-quote-color: var(--payments-mpos-overview-dark-mode-list-offer-skeleton-color, var(--payments-mpos-overview-list-offer-skeleton-color, ${et("colorPrimarySurfaceAlternativePreloading",it)}));
  --_payments-mpos-overview-list-offer-skeleton-quote-bg: var(--payments-mpos-overview-list-offer-skeleton-bg-color, transparent);
  --_payments-mpos-overview-list-offer-skeleton-animated-layer-bg: var(--payments-mpos-overview-dark-mode-list-offer-skeleton-animated-layer-bg, var(--payments-mpos-overview-list-offer-skeleton-animated-layer-bg, ${et("colorPrimarySurfaceAmbientPressed",it)}));
  --_payments-mpos-overview-list-offer-card-illustration-brackground-color: var(--payments-mpos-overview-list-offer-card-illustration-brackground-color, ${et("colorPrimaryAltFormatDivider",it)});
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([loading]) {
  position: relative;
  pointer-events: none;
  height: var(--_payments-mpos-overview-panel-info-skeleton-height, 9.875rem);
  background-repeat: no-repeat;
  background-image: linear-gradient(var(--_payments-mpos-overview-list-offer-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-list-offer-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-list-offer-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_payments-mpos-overview-list-offer-skeleton-quote-color) 50%);
  background-color: var(--_payments-mpos-overview-list-offer-skeleton-quote-bg);
  background-size: 88px 120px, calc((60% * 2) + (16px/ 2)) 16px, calc((45% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 96px 16px, 96px 42px, 96px 80px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  background: var(--_payments-mpos-overview-list-offer-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

.card {
  background-color: ${et("colorPrimarySurfaceAlternativeDefault",it)};
  padding: 1rem;
  box-shadow: var(--_payments-mpos-overview-list-offer-card-box-shadow);
  box-sizing: border-box;
  position: relative;
  min-height: 4rem;
}
.card__microillustrationContainer {
  display: flex;
  justify-content: left;
  padding: 1rem 0 0 1.5rem;
  flex: none;
  flex-basis: calc((100% - 96px) / 4 + 32px);
}
.card__image {
  height: 4rem;
  width: 4rem;
}
.card__info {
  margin-top: 1rem;
  display: flex;
  flex-direction: column;
}
.card__info [data-tag-name=bbva-type-link] {
  padding-top: 0.5rem;
}
.card__info [data-tag-name=bbva-type-text]:first-of-type {
  margin-bottom: 0.5rem;
  font-style: var(--payments-mpos-overview-list-offer-description-font-style, inherit);
}
.card > [data-tag-name=bbva-type-link] {
  position: absolute;
  top: 0;
  right: 0;
  padding: 0.5rem 0.3125rem;
}

:host([carousel-item]) {
  background-color: ${et("colorPrimarySurfaceAlternativeDefault",it)};
  --payments-mpos-overview-list-offer-card-box-shadow: none;
  width: 12.625rem;
  height: 14rem;
}
:host([carousel-item]) .card__info [data-tag-name=bbva-type-text]:first-of-type {
  margin-bottom: 0.5rem;
}
:host([carousel-item]) .card__info [data-tag-name=bbva-type-link] {
  top: 0.5rem;
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
`;const zo={primary:g`
    ${ut.primary}
    ${st.primary}
  `,secondary:g`
    ${ut.secondary}
    ${st.secondary}
  `},Uo="close",qo="action";class jo extends(D(_)){static get is(){return"payments-mpos-overview-list-offer"}static get properties(){return{description:{type:String},hasCloseButton:{type:Boolean,attribute:"has-close-button"},hidden:{type:Boolean,reflect:!0},hideOnClick:{type:Boolean,attribute:"hide-on-click"},icon:{type:String},isCarouselItem:{type:Boolean,attribute:"is-carousel-item"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},microillustration:{type:String},titleFontWeight:{type:String,attribute:"title-font-weight"},titleSize:{type:String,attribute:"title-size"},titleText:{type:String,attribute:"title-text"}}}constructor(){super(),this.description="",this.hasCloseButton=!1,this.hideOnClick=!1,this.icon="",this.isCarouselItem=!1,this.linkText="",this.loading=!1,this.microillustration="",this.titleFontWeight="",this.titleSize="",this.titleText=""}static get styles(){return[No,zo.primary,zo.secondary,ot.primary,ot.secondary,$("payments-mpos-overview-list-offer-shared-styles")]}static get scopedElements(){const t=[ft,dt,lt];return jo.scopedElementsFromClasses(t)}_handleOnClick(t){this.hideOnClick&&t===Uo&&(this.hidden=this.hideOnClick),this.dispatchEvent(new CustomEvent(`${this.constructor.is}-${t}-click`,{composed:!0}))}get _headerImageTpl(){return f`
      ${this.microillustration?f`<div class="card__microillustrationContainer">
            <div class="card__image">${X[this.microillustration]}</div>
          </div>`:f`<bbva-type-icon ambient="primary" icon="${this.icon}" size="32"> </bbva-type-icon>`}
    `}render(){return f`
      ${this.loading?f` <div class="skeleton"></div> `:f`
            <div class="card">
              ${this._headerImageTpl}
              <div class="card__info">
                <bbva-type-text
                  font-weight="${this.titleFontWeight}"
                  text="${this.titleText}"
                  unset
                  ?size="${this.titleSize}"
                ></bbva-type-text>
                <bbva-type-text size="S" text="${this.description}" unset></bbva-type-text>
                <bbva-type-link
                  aria-label="${qo}"
                  @click="${()=>this._handleOnClick(qo)}"
                  >${this.linkText}</bbva-type-link
                >
              </div>
              ${this.hasCloseButton?f` <bbva-type-link
                    aria-label="${Uo}"
                    icon-size="16"
                    icon="${z()}"
                    @click="${()=>this._handleOnClick(Uo)}"
                  ></bbva-type-link>`:f``}
            </div>
          `}
    `}}var Wo=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.content {
  text-align: initial;
}

ul {
  margin: 0;
  padding: 0;
}

li {
  list-style: none;
  position: relative;
  padding: 0 1rem;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

[data-tag-name=bbva-type-text] {
  padding: 0 1rem;
}

[data-tag-name=bbva-header-category] {
  margin-top: 1rem;
  padding-left: 1rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 1rem;
}
`;class Jo extends(tt(m(_e(wa(Qi(na(D(_)))))))){static get is(){return"payments-mpos-overview-link-settings"}static get scopedElements(){const t=[re,le,kt,Dt,Tt,dt];return Jo.scopedElementsFromClasses(t)}static get properties(){return{currentSelectedOption:{type:String,attribute:"current-selected-option"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},validPeriodTypes:{type:Array,attribute:"valid-period-types"},visible:{type:Boolean},_radioButtonsStatus:{type:Array}}}constructor(){super(),this.currentSelectedOption="",this.hasFeatureHeaderHidden=!1,this.validPeriodTypes=[],this.visible=!1,this._closeModalElements=["header-right-primary"],this._radioButtonsStatus=[]}static get styles(){return[Wo,oe.primaryAlt,ne.primaryAlt,Ct.primaryAlt,st.primaryAlt,$("payments-mpos-overview-link-settings-shared-styles")]}updated(t){t.forEach(((t,e)=>{"currentSelectedOption"===e&&t!==this[e]&&(this._radioButtonsStatus=this.validPeriodTypes.map((t=>({value:t,selected:t===this.currentSelectedOption}))),this._saveValue=!!t,t||(this._currentSavedValue=this.currentSelectedOption)),"visible"===e&&(this.visible?()=>this.addView(this):()=>this.closeView(this))()}))}_handleSaveSettingsClick(t){t.stopPropagation(),this._saveValue?(this.showLoader(),this._dispatchEvent(`${this.constructor.is}-selected-expiration-range`,this.currentSelectedOption),this._currentSavedValue=this.currentSelectedOption,this._saveValue=!1):this._dispatchEvent(`${this.constructor.is}-close`)}_onRadioButtonChange(t){const{value:e}=t.detail;this.currentSelectedOption=e}get _radioButtonsTpl(){return f`
      <bbva-form-container
        divider-size="fit"
        @form-container-radio-change="${t=>this._onRadioButtonChange(t)}"
      >
        ${this._radioButtonsStatus.map((t=>f`
            <bbva-form-control-input
              name="expiring-period"
              slot="_option"
              type="radio"
              value="${t.value}"
              ?checked="${t.selected}"
            >
              <div slot="right">
                <bbva-type-text
                  text="${this.getValidPeriodLinkText(t.value)}"
                ></bbva-type-text>
              </div>
            </bbva-form-control-input>
          `))}
      </bbva-form-container>
    `}render(){return f`
      <bbva-help-modal
        aria-label="${this.t(`${this.constructor.is}-settings-help`)}"
        button-text="${this.t(`${this.constructor.is}-save-button`)}"
        fixed-footer
        full-height
        header-close-icon-aria-label="${this.t(`${this.constructor.is}-close-modal`)}"
        header-text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-header-main-text`)}"
        hide-content-padding-top
        ?visible="${this.visible}"
        .closeModalElements="${this._closeModalElements}"
        @help-modal-close="${t=>{t.stopPropagation(),this.visible=!1,this.currentSelectedOption=this._currentSavedValue,this._dispatchEvent(`${this.constructor.is}-close`)}}"
        @help-modal-footer-button-click="${t=>this._handleSaveSettingsClick(t)}"
      >
        <div class="modal-content" slot="slot-content">
          <bbva-header-category
            heading-level="2"
            text="${this.t(`${this.constructor.is}-header-title`)}"
          ></bbva-header-category>
          <bbva-type-text
            text="${this.t(`${this.constructor.is}-subtitle-info`)}"
            size="XS"
          ></bbva-type-text>
          ${this._radioButtonsTpl}
          <bbva-notification-message
            book-title
            message-title="${this.t(`${this.constructor.is}-notification-message-text`)}"
          >
          </bbva-notification-message>
        </div>
      </bbva-help-modal>
    `}}var Go=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.iva-select__wrapper {
  margin: 1rem 0 1.25rem;
}

[data-tag-name=bbva-form-select] {
  text-align: left;
}

[data-tag-name=payments-mpos-overview-item-link] {
  text-align: left;
  padding: 1rem 0;
}

[data-tag-name=bbva-header-category] {
  margin-bottom: 0.5rem;
  padding-left: 0;
}

.default-merchant__wrapper {
  display: flex;
  justify-content: space-between;
  gap: 1rem;
}
.default-merchant__info__wrapper {
  padding-top: 0.5rem;
}

[data-tag-name=bbva-form-toggle] {
  --bbva-form-toggle-list-container-padding: 0;
}

[data-tag-name=bbva-help-modal][modal-type=caution] {
  --bbva-type-text-white-space-ellipsis: normal;
}
`;class Xo extends(tt(m(_e(wa(na(la(D(_)))))))){static get is(){return"payments-mpos-overview-settings-modal"}static get scopedElements(){const t=[xt,qt,jt,se,Dt,kt,dt,Ns,ja,Jo];return Xo.scopedElementsFromClasses(t)}static get properties(){return{defaultMerchantExists:{type:Boolean,attribute:"default-merchant-exists"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},selectedMerchant:{type:Object,attribute:"selected-merchant"},shouldCloseCardReaderSettings:{type:Boolean,attribute:"should-close-card-reader-settings"},showToggle:{type:Boolean,attribute:"show-toggle"},visible:{type:Boolean},_cardReaderDevice:{type:Object},_modifiedSettingsData:{type:Object},_formTouched:{type:Boolean},_isCardReaderSettingsVisible:{type:Boolean},_isDefaultMerchantWarningVisible:{type:Boolean},_isDefaultMerchantToggleChecked:{type:Boolean},_isLinkSettingsVisible:{type:Boolean}}}constructor(){super(),this.defaultMerchantExists=!1,this.hasFeatureHeaderHidden=!1,this.selectedMerchant={},this.shouldCloseCardReaderSettings=!1,this.showToggle=!1,this.visible=!1,this._cardReaderDevice={},this._closeModalElements=["header-right-primary"],this._modifiedSettingsData={data:{defaultIVAId:"",isDefault:!1},modifiedFields:[]},this._formTouched=!1,this._isCardReaderSettingsVisible=!1,this._isDefaultMerchantWarningVisible=!1,this._isDefaultMerchantToggleChecked=!1,this._isLinkSettingsVisible=!1}static get styles(){return[Go,wt.primaryAlt,zt.primaryAlt,Ut.primaryAlt,ae.primaryAlt,Ct.primaryAlt,st.primaryAlt,$("payments-mpos-overview-settings-modal-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._boundResetDataUserSettings=this._resetDataUserSettings.bind(this),document.addEventListener("payments-mpos-overview-dm-put-user-setting-error",this._boundResetDataUserSettings)}disconnectedCallback(){document.removeEventListener("payments-mpos-overview-dm-put-user-setting-error",this._boundResetDataUserSettings),super.disconnectedCallback&&super.disconnectedCallback()}updated(t){t.forEach(((t,e)=>{var i,a;"selectedMerchant"===e&&this.selectedMerchant&&(this._cardReaderDevice=this.selectedMerchant.cardReaderDevice||{},this._paymentMethods=(null===(i=this.selectedMerchant)||void 0===i?void 0:i.products[0].paymentMethods)||[]);("_modifiedSettingsData"===e&&t!==this[e]&&this._modifiedSettingsData.modifiedFields.length&&(this._formTouched=!0),"visible"===e)&&(this.visible?(this.addView(this),this._isDefaultMerchantToggleChecked=!(null===(a=this.selectedMerchant)||void 0===a||!a.isDefault),this._modifiedSettingsData.data.isDefault=this._isDefaultMerchantToggleChecked,this._modifiedSettingsData.data.defaultIVAId=this.selectedIva):(this._resetForm(),this.closeView(this)));"shouldCloseCardReaderSettings"===e&&this[e]&&(this._isCardReaderSettingsVisible=!1,this._dispatchEvent(`${this.constructor.is}-card-reader-settings-close`))}))}_getPaymentMethodDescription(t){return{[ni.PRESENT_CARD.id]:this._cardReaderDevice.name??"",[ni.PAYMENT_LINK.id]:this.getValidPeriodLinkText(this.expirationDays)}[t]}_handleDeviceConnectionSuccess({detail:t}){this._dispatchEvent(`${this.constructor.is}-new-device-select`,{cardReaderDevice:t}),this._cardReaderDevice=t}_resetDataUserSettings(t){const e=Object.keys(t.detail.data)[0];this[`_${e}`]=this.selectedMerchant[e]}_onPaymentMethodClick(t){const e={[ni.PAYMENT_LINK.id]:"_isLinkSettingsVisible",[ni.PRESENT_CARD.id]:"_isCardReaderSettingsVisible"};this[e[t]]=!!(t in e)}_updateFormData(t,e){this._modifiedSettingsData.data[t]!==e&&(this._modifiedSettingsData={...this._modifiedSettingsData,data:{...this._modifiedSettingsData.data,[t]:e},modifiedFields:this._modifiedSettingsData.modifiedFields.includes(t)?this._modifiedSettingsData.modifiedFields:[...this._modifiedSettingsData.modifiedFields,t]})}_handleToggleChange(t){this._isDefaultMerchantToggleChecked=t,this.defaultMerchantExists?this._isDefaultMerchantWarningVisible=!0:this._updateFormData("isDefault",t)}_handleSubmit(t){t.stopPropagation(),this.showLoader(oi);const e=this._modifiedSettingsData.modifiedFields.reduce(((t,e)=>(t[e]=this._modifiedSettingsData.data[e],t)),{});this._dispatchEvent(`${this.constructor.is}-click-cta-btn`,e)}_resetForm(){this._modifiedSettingsData={data:{defaultIVAId:"",isDefault:!1},modifiedFields:[]},this._formTouched=!1}get _selectDefaultMerchantTpl(){return f`
      <div class="default-merchant__wrapper">
        <div class="default-merchant__info__wrapper">
          <bbva-header-category
            heading-level="2"
            text="${this.t(`${this.constructor.is}-default-merchant-title`)}"
          ></bbva-header-category>
          <bbva-type-text
            text="${this.t(`${this.constructor.is}-default-merchant-description`)}"
          ></bbva-type-text>
        </div>
        <bbva-form-toggle
          ?checked="${this._isDefaultMerchantToggleChecked}"
          @form-toggle-switch-change="${({detail:{checked:t}})=>this._handleToggleChange(t)}"
        ></bbva-form-toggle>
      </div>
    `}get _selectDefaultMerchantWarningTpl(){return f`
      <bbva-help-modal
        aria-label="${this.t(`${this.constructor.is}-default-merchant-${this._isDefaultMerchantToggleChecked?"update":"remove"}-warning-modal`)}"
        body-text="${this.t(`${this.constructor.is}-default-merchant-${this._isDefaultMerchantToggleChecked?"update":"remove"}-warning-body-text`)}"
        button-text="${this.t(`${this.constructor.is}-default-merchant-${this._isDefaultMerchantToggleChecked?"update":"remove"}-warning-button`)}"
        header-text="${this.t(`${this.constructor.is}-default-merchant-warning-header`)}"
        link-text="${this.t(`${this.constructor.is}-default-merchant-${this._isDefaultMerchantToggleChecked?"update":"remove"}-warning-link`)}"
        modal-type="caution"
        title-icon="${F()}"
        title-text="${this._isDefaultMerchantToggleChecked?"":this.t(`${this.constructor.is}-default-merchant-remove-warning-title`)}"
        ?visible="${this._isDefaultMerchantWarningVisible}"
        @help-modal-footer-button-click="${()=>this._updateFormData("isDefault",this._isDefaultMerchantToggleChecked)}"
        @help-modal-transitionend="${({detail:{visible:t}})=>{t||(this._isDefaultMerchantWarningVisible=t,this._isDefaultMerchantToggleChecked=this._modifiedSettingsData.data.isDefault)}}"
      >
      </bbva-help-modal>
    `}get _ivaSelectTpl(){return f`
      <div class="iva-select__wrapper">
        <bbva-header-category
          heading-level="2"
          text="${this.t(`${this.constructor.is}-calculator`)}"
        ></bbva-header-category>

        <bbva-form-select
          ambient="primary-alt"
          info-message="${this.t(`${this.constructor.is}-iva-info`)}"
          label="${this.t(`${this.constructor.is}-iva-label`)}"
          required
          @bbva-form-select-selected-item="${t=>{this._updateFormData("defaultIVAId",t.target.value)}}"
        >
          ${this.taxTypes.map((t=>f`
              <bbva-form-option value="${t}" ?selected="${this.selectedIva===t}">
                ${Number.isNaN(Number(t))?this.t(`${this.constructor.is}-${t.toLowerCase()}`):`${t}%`}
              </bbva-form-option>
            `))}
        </bbva-form-select>
      </div>
    `}get _chargeMethodsTpl(){var t;return f`
      <div class="charge-methods__wrapper">
        <bbva-header-category
          heading-level="2"
          text="${this.t(`${this.constructor.is}-charge-methods`)}"
        ></bbva-header-category>
        ${null===(t=this._paymentMethods)||void 0===t?void 0:t.map(((t,e)=>f`
            <payments-mpos-overview-item-link
              header-description="${this._getPaymentMethodDescription(t.id)}"
              header-text="${this.t(`${this.constructor.is}-${t.id.toLowerCase()}`)}"
              link-icon-left="${ni[t.id].icon}"
              @payments-mpos-overview-item-link-click="${()=>this._onPaymentMethodClick(t.id)}"
            >
            </payments-mpos-overview-item-link>
            ${e!==this._paymentMethods.length-1?f` <bbva-divider-default></bbva-divider-default> `:""}
          `))}
      </div>
    `}get _linkSettingsTpl(){return f`
      <payments-mpos-overview-link-settings
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${this._isLinkSettingsVisible}"
        .currentSelectedOption="${this.expirationDays}"
        .validPeriodTypes="${this.validPeriodTypes}"
        @payments-mpos-overview-link-settings-selected-expiration-range="${t=>{this._dispatchEvent(`${this.constructor.is}-click-period-link`,{validPeriodPaymentLinkId:t.detail})}}"
        @payments-mpos-overview-link-settings-close="${()=>{this._isLinkSettingsVisible=!1}}"
      >
      </payments-mpos-overview-link-settings>
    `}get _connectCardReaderTpl(){return f`
      <payments-mpos-overview-connect-card-reader-modal
        mode="configuration"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${this._isCardReaderSettingsVisible}"
        .defaultDevice="${this._cardReaderDevice}"
        @payments-mpos-overview-connect-card-reader-modal-new-device-select="${t=>this._handleDeviceConnectionSuccess(t)}"
        @payments-mpos-overview-connect-card-reader-modal-close="${()=>{this._isCardReaderSettingsVisible=!1}}"
      >
      </payments-mpos-overview-connect-card-reader-modal>
    `}get _contentModalTpl(){return this.visible?f`
          <div class="content" slot="slot-content">
            ${this.showToggle?this._selectDefaultMerchantTpl:""} ${this._ivaSelectTpl}
            ${this._chargeMethodsTpl}
          </div>
        `:""}render(){var t;return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t("close-modal")}"
        aria-label="${this.t(`${this.constructor.is}-modal`)}"
        button-text="${this.t(`${this.constructor.is}-cta-button`)}"
        fixed-footer
        full-height
        header-text="${this.hasFeatureHeaderHidden?"":null===(t=this.selectedMerchant)||void 0===t?void 0:t.name}"
        header-type="modal"
        hide-content-padding-top
        ?disabled-button="${!this._formTouched}"
        ?visible="${this.visible}"
        .closeModalElements="${this._closeModalElements}"
        @help-modal-close="${t=>{t.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-close`)}}"
        @help-modal-footer-button-click="${this._handleSubmit}"
      >
        ${this._contentModalTpl}
      </bbva-help-modal>
      ${this._linkSettingsTpl} ${this._connectCardReaderTpl}
      ${this._selectDefaultMerchantWarningTpl}
    `}}var Yo=g`
/* stylelint-disable */
:host {
  display: block;
  box-sizing: border-box;
  --bbva-transition-container-padding: 0;
  --bbva-transition-container--custom--primary-ambient--content-bg-color: ${et("colorPrimarySurfaceAmbientDefault",it)};
  --bbva-transition-container-modal-container-flex-grow: 1;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[slot=slot-content] {
  color: ${et("colorPrimaryAltText01Default",it)};
  height: 100%;
  display: flex;
  flex-direction: column;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--payments-mpos-overview-background-color);
}

[data-tag-name=bbva-button-row] {
  --bbva-button-action-dark-mode-color: var(--payments-mpos-overview-dark-mode-button-row-color);
  --bbva-button-action-active-dark-mode-color: var(--payments-mpos-overview-dark-mode-active-button-row-color);
}

[data-tag-name=bbva-expandable-panel] {
  display: inline-flex;
  margin-bottom: 0.5rem;
}

[data-tag-name=payments-mpos-overview-panel-detail] {
  margin-bottom: 0.5rem;
  --payments-mpos-overview-panel-detail-date-font-weight: ${et("fontWeight",y.mediumItalic)};
  --payments-mpos-overview-panel-detail-date-font-style: ${et("fontStyle20",B)};
}

[data-tag-name=payments-mpos-overview-list-simple] {
  --payments-mpos-overview-list-simple-description-text-font-weight: ${et("fontWeight",y.medium)};
  --payments-mpos-overview-list-simple-description-amount-font-weight: ${et("fontWeight",y.medium)};
}

.main-content {
  flex-grow: 1;
}
`;const Ko={LINK_COBRO:"payment-link",CARD_PRESENT:"card-present",TAP_ON_PHONE:"tap-on-phone"};class Zo extends(D(m(_e(Qi(na(_)))))){static get is(){return"payments-mpos-overview-transaction-detail"}static get properties(){return{actions:{type:Array},commission:{type:Number},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},isLinkManagement:{type:Boolean,attribute:"is-link-management"},language:{type:String},transactionDetail:{type:Object,attribute:"transaction-detail"},visible:{type:Boolean},_showMore:{type:Boolean}}}static get scopedElements(){const t=[Mt,ce,Pt,as,Fa];return Zo.scopedElementsFromClasses(t)}static get styles(){return[Yo,Et.primaryAlt,de.primaryAlt,$("payments-mpos-overview-transaction-detail-shared-styles")]}constructor(){super(),this.actions=[],this.commission=0,this.hasFeatureHeaderHidden=!1,this.isLinkManagement=!1,this.language="",this.transactionDetail={},this.visible=!1,this._paymentMethod="",this._showMore=!1}updated(t){t.forEach(((t,e)=>{"visible"===e&&(this.visible?()=>this.addView(this):()=>this.closeView(this))()}))}get _onIconClickActions(){return[()=>this._leaveTransactionDetail(),()=>this._handleOnMenuIconClick({payload:Zo.is})]}_navigateBack(){this._leaveTransactionDetail()}_getBadgeDescription(t){if(this.isLinkManagement)return this.t(`${this.constructor.is}-${t}`);return{completed:"",cancelled:this.t(`${this.constructor.is}-${t}`),refund:""}[t]??this.t(`${this.constructor.is}-${t}`)}_getTranslation(t,e){return this.t(`${this.constructor.is}-${t.toLowerCase()}`,{param:e})}_handleRowButtonClick(t){const{action:e}=t;this._dispatchEvent(`${this.constructor.is}-${"payment-voucher-share"===e?`${Ko[this._paymentMethod]}-${e}`:e}`,{action:e,transactionDetail:this.transactionDetail})}_leaveTransactionDetail(){this._showMore=!1,this.visible=!1}_shouldDisplayItem(t){return this._showMore||t<6}get _expandablePanelTpl(){return this.visible?f`
          <bbva-expandable-panel
            text-unexpanded="${this._getTranslation("see-more")}"
            text-expanded="${this._getTranslation("see-less")}"
            @expandable-panel-expand="${t=>{this._showMore=t.detail}}"
          ></bbva-expandable-panel>
        `:""}get _operationSummaryData(){var t,e;const{amount:i,authorization:a,card:s,checkoutLink:o,creationDate:n,customer:r,expirationDate:l,id:d,method:c,operationDate:h,payment_method_name:p,status:m,transaction:u,paymentPlan:v}=this.transactionDetail;return this._paymentMethod=o?"LINK_COBRO":p,[{label:this._getTranslation("total-amount"),amount:i},{label:this._getTranslation("commission"),amount:Math.abs(this.commission*i),amountDescription:this._getTranslation("commission-van")},{label:this._getTranslation("merchant"),value:null===(t=this.getSelectedMerchant())||void 0===t?void 0:t.name},{label:this._getTranslation("identifier"),value:null===(e=this.getSelectedMerchant())||void 0===e?void 0:e.id},{label:this._getTranslation("charge-method"),value:this.isLinkManagement?this._getTranslation("link_cobro"):this._getTranslation(p)},{label:this._getTranslation("interest-free-label"),value:this._getTranslation("interest-free-value",v),notVisible:!v},{label:this._getTranslation("service-operator"),value:this._getTranslation("openpay")},{label:this._getTranslation("issuer"),value:null==s?void 0:s.bank_name,notVisible:!s||!Object.keys(s).length},{label:this._getTranslation("payment-method"),value:s&&`${this._getTranslation("card")} ${s.brand} ${this._getTranslation(s.type)}`,notVisible:!s||!Object.keys(s).length},{label:this._getTranslation("payment-method"),value:c?this._getTranslation(c):"",notVisible:s&&Object.keys(s).length||this.isLinkManagement},{label:this._getTranslation("origin-account"),value:c?this._getTranslation(c):"",notVisible:"transfer"!==c},{label:this._getTranslation("card-number"),maskContent:null==s?void 0:s.card_number,notVisible:!s||!Object.keys(s).length,isObfuscate:!0},{label:this._getTranslation("auth-number"),value:a||(null==u?void 0:u.authorization)||"",notVisible:this.isLinkManagement&&"processed"!==m||!a&&!(null!=u&&u.authorization)},{label:this._getTranslation("name"),value:null==r?void 0:r.name,notVisible:!r||!Object.keys(r).length},{label:this._getTranslation("email"),value:null==r?void 0:r.email,notVisible:!r||!Object.keys(r).length,isObfuscate:!0},{label:this._getTranslation("send-date"),value:Ei(n,this.language,xe),notVisible:!r||!Object.keys(r).length},{label:this._getTranslation("send-time"),value:Ei(n,this.language,Te),notVisible:!r||!Object.keys(r).length},{label:this._getTranslation("expiration-date"),value:Ei(l,this.language,xe),notVisible:!this.isLinkManagement||"processed"===m},{label:this._getTranslation(this.isLinkManagement?"operation-date":"date"),value:Ei(h||(null==u?void 0:u.creationDate),this.language,xe),notVisible:this.isLinkManagement&&"processed"!==m},{label:this._getTranslation(this.isLinkManagement?"operation-time":"time"),value:Ei(h||(null==u?void 0:u.creationDate),this.language,Te),notVisible:this.isLinkManagement&&"processed"!==m},{label:this._getTranslation("id"),value:d}]}get _buttonRowTpl(){return f`
      <bbva-button-row
        accessibility-text="${this.t(`${this.constructor.is}-actions`)}"
        .options="${this.actions}"
        @button-row-item-click="${t=>this._handleRowButtonClick(this.actions[t.detail])}"
      ></bbva-button-row>
    `}get _operationSummaryTpl(){return f`
      ${this._operationSummaryData.map((({amount:t,amountDescription:e,label:i,value:a,maskContent:s,notVisible:o,isObfuscate:n},r)=>!o&&this._shouldDisplayItem(r)?f`
                <payments-mpos-overview-list-simple
                  amount="${M(t)}"
                  amount-description="${M(e)}"
                  currency-code="${this.transactionDetail.currency}"
                  description="${s?((t,e=4)=>`•${t.slice(-e)}`)(s):M(a)}"
                  label="${M(i)}"
                  label-ellipsis
                  language="${this.language}"
                  local-currency="${this.transactionDetail.currency}"
                  ?data-acoustic-obfuscate="${n}"
                >
                </payments-mpos-overview-list-simple>
              `:""))}
      ${this._expandablePanelTpl}
    `}get _panelAmountTpl(){const{amount:t,currency:e,creationDate:i,description:a,operationDate:s,status:o}=this.transactionDetail;return f`
      <payments-mpos-overview-panel-detail
        amount="${t}"
        currency-code="${e}"
        badge-status="${ze[o.toLowerCase()]}"
        badge-text="${this._getBadgeDescription(o.toLowerCase())}"
        date="${s??i}"
        main-text="${a}"
        language="${this.language}"
        local-currency="${e}"
        variant="2xl"
        .dateFormatOptions="${De}"
      >
      </payments-mpos-overview-panel-detail>
    `}get _headerDetailText(){return this.hasFeatureHeaderHidden?"":this.isLinkManagement?this.t(`${this.constructor.is}-header-text-link`):this.t(`${this.constructor.is}-header-text-sale`)}get _headerMainButtons(){return[{id:`${this.constructor.is}-btn-menu`,icon:J(),accessibilityText:this.t(`${this.constructor.is}-global-menu`)}]}render(){return f`
      <bbva-transition-container
        header-show-left-icon
        header-text="${this._headerDetailText}"
        header-type="first-level-sequential"
        reset-scroll
        ?visible="${this.visible}"
        .closeModalIndex="${[]}"
        .headerButtons="${this._headerMainButtons}"
        @header-main-icon-click="${t=>{const{index:e}=t.detail;t.stopPropagation(),this._onIconClickActions[e]()}}"
        @transition-container-close="${t=>{t.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-close`)}}"
      >
        ${Object.keys(this.transactionDetail).length&&f`
          <div slot="slot-content">
            <div class="main-content">${this._panelAmountTpl} ${this._operationSummaryTpl}</div>
            ${this._buttonRowTpl}
          </div>
        `}
      </bbva-transition-container>
    `}}var Qo=g`
/* stylelint-disable */
:host {
  display: block;
  box-sizing: border-box;
  height: 100%;
  width: 100%;
  --bbva-transition-container-padding: 0;
}
:host [ambient^=secondary] {
  --bbva-carousel-default-slide-bg: ${et("colorSecondaryCtaDisabledBackground",it)};
  --payments-mpos-overview-panel-info-skeleton-animated-layer-bg: ${et("colorSecondaryCtaDisabledBackground",it)};
  --payments-mpos-overview-panel-info-skeleton-color: ${et("colorPrimarySurfaceAmbientOverlay",it)};
  --payments-mpos-overview-list-offer-card-info-brackground-color: var(--payments-mpos-overview-dark-mode-list-offer-dashboard-bg, var(--payments-mpos-overview-list-offer-dashboard-bg, ${et("colorPrimarySurfaceAmbientOverlay",it)}));
  --payments-mpos-overview-list-offer-card-illustration-brackground-color: var(--payments-mpos-overview-dark-mode-list-offer-dashboard-bg, var(--payments-mpos-overview-list-offer-dashboard-bg, ${et("colorPrimarySurfaceAmbientOverlay",it)}));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-carousel-default][type=swipe] {
  --bbva-type-link-color: ${et("colorSecondaryLinkMainPressed",it)};
  --payments-mpos-overview-panel-info-description-margin: 0;
  --payments-mpos-overview-panel-info-description-padding: rem(24px) rem(16px);
  --payments-mpos-overview-panel-info-title-margin: 0 0 0.5rem;
  --payments-mpos-overview-panel-info-content-panel-padding: 1.5rem 1rem;
}

.carousel-offers {
  --bbva-carousel-default--custom--primary-ambient--slide-bg-color: ${et("colorPrimarySurfaceAmbientDefault",it)};
  margin-bottom: 1rem;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--payments-mpos-overview-background-color);
}
[data-tag-name=bbva-transition-container] [slot=slot-content] {
  z-index: 0;
  position: relative;
}

[data-tag-name=bbva-button-row] {
  margin-top: 1rem;
}

[data-tag-name=bbva-header-category] {
  margin-left: 1rem;
}

[data-tag-name=payments-mpos-overview-list-offer] {
  --payments-mpos-overview-list-offer-card-box-shadow:none;
  margin: 0.5rem 0 1.5rem 0;
}

[data-tag-name=payments-mpos-overview-list-offer][loading] {
  margin: 1rem;
}

[data-tag-name=bbva-notification-contextual] {
  margin: 1rem;
  text-align: left;
}

[data-tag-name=bbva-notification-toast] {
  z-index: 10;
  position: fixed;
  bottom: 0;
  width: 100%;
}
`;const tn="payments-mpos-overview-manage-links",en="payments-mpos-overview-search-results";j("dashboard-commons-shared-styles",g`
    ${Qo}
  `);class an extends(D(P(m(Qi(_e(fa(sa(ka(na(Co(_))))))))))){static get is(){return"payments-mpos-overview-dashboard"}static get properties(){return{commission:{type:Number},dataUserSettings:{type:Object,attribute:"data-user-settings"},datePickerData:{type:Object,attribute:"date-picker-data"},datePickerError:{type:Object,attribute:"date-picker-error"},dashboardTransactionsListFailed:{type:Boolean,attribute:"dashboard-transactions-list-failed"},filterTypeStatusLink:{type:Array,attribute:"filter-type-status-link"},fromDate:{type:String,attribute:"from-date"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},hasTopProduct:{type:Boolean,attribute:"has-top-product"},hasToUpdateOperationsList:{type:Boolean,attribute:"has-to-update-operations-list"},isBackFromChargeZone:{type:Boolean,attribute:"is-back-from-charge-zone"},isRefundCancelled:{type:Boolean,attribute:"is-refund-cancelled"},isTopReady:{type:Boolean,attribute:"is-top-ready"},language:{type:String},loading:{type:Boolean},navigateToConfiguration:{type:Boolean,attribute:"navigate-to-configuration"},navigateToManageLinks:{type:Boolean,attribute:"navigate-to-manage-links"},sdkErrorResponse:{type:Object,attribute:"sdk-error-response"},selected:{type:Number},showBICard:{type:Boolean,attribute:"show-bi-card"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},showSpinnerCarousel:{type:Boolean,attribute:"show-spinner-carousel",reflect:!0},showToastUserSettings:{type:Boolean,attribute:"show-toast-user-settings"},singleUseJws:{type:String,attribute:"single-use-jws"},taxTypes:{type:Array,attribute:"tax-types"},validPeriodTypes:{type:Array,attribute:"valid-period-types"},viewDigitalSales:{type:Boolean,attribute:"view-digital-sales"},visible:{type:Boolean},_merchants:{type:Array},_isCalculatorVisible:{type:Boolean},_isEditLinkDateVisible:{type:Boolean},_isLastChargesModalVisible:{type:Boolean},_isManageLinksVisible:{type:Boolean},_isOperationListLoading:{type:Boolean},_isSdkErrorModalVisible:{type:Boolean},_isSearchMovementsVisible:{type:Boolean},_isSearchSalesByIdVisible:{type:Boolean},_isSeeMoreActionsVisible:{type:Boolean},_isSettingsModalVisible:{type:Boolean},_isTransactionDetailVisible:{type:Boolean},operationsList:{type:Array},_refundResquestStatus:{type:Object},_showCancelLinkWarning:{type:Boolean},_showRefundHandler:{type:Boolean},_showTopOffer:{type:Boolean},_swiperConfig:{type:Object},_transactionActions:{type:Array}}}static get scopedElements(){const t=[Mt,Jt,Dt,St,Rt,Pt,vo,jo,Ho,So,ws,ao,lo,Lo,Io,Vo,Xo,oo,Zo];return an.scopedElementsFromClasses(t)}static get styles(){return[Qo,$("payments-mpos-overview-dashboard-shared-styles"),Et.primary,Wt.primary,Ct.primary,Lt.primary]}constructor(){super(),this.commission=0,this.dashboardTransactionsListFailed=!1,this.dataUserSettings={},this.datePickerData={},this.datePickerError={},this.filterTypeStatusLink=[],this.fromDate="",this.hasFeatureHeaderHidden=!1,this.hasTopProduct=!1,this.hasToUpdateOperationsList=!1,this.isBackFromChargeZone=!1,this.isRefundCancelled=!1,this.isTopReady=!1,this.language="",this.loading=!1,this.navigateToConfiguration=!1,this.navigateToManageLinks=!1,this.operationsList=[],this.sdkErrorResponse={},this.selected=0,this.showBICard=!1,this.showHelpFaqs=!1,this.showSpinnerCarousel=!1,this.showToastUserSettings=!1,this.singleUseJws="",this.taxTypes=[],this.validPeriodTypes=[],this.viewDigitalSales=!1,this.visible=!1,this._shouldCloseCardReaderSettings=!1,this._isCalculatorVisible=!1,this._isEditLinkDateVisible=!1,this._isLastChargesModalVisible=!1,this._isManageLinksVisible=!1,this._isOperationListLoading=!1,this._isSdkErrorModalVisible=!1,this._isSearchMovementsVisible=!1,this._isSearchSalesByIdVisible=!1,this._isSeeMoreActionsVisible=!1,this._isSettingsModalVisible=!1,this._isShareLinkVoucherError=!1,this._isShareVoucherModalVisible=!1,this._isTransactionDetailVisible=!1,this._merchants=[],this._offersList=[],this._refundData={},this._shareVoucherType="",this._showCancelLinkWarning=!1,this._showRefundHandler=!1,this._showRefundScanDevicesModal=!1,this._showTopCard=!1,this._showTopOffer=!1,this._transactionActions=[],this._swiperConfig={initialSlide:0},this._refundResquestStatus={requester:"",success:!1},this.config.notifyFeature=!0}updated(t){t.forEach(((t,e)=>{if(("loading"===e||"isBackFromChargeZone"===e)&&t!==this[e]){this._merchants=this.loading?[]:this.getMerchants();const t=this._merchants.indexOf(this.getSelectedMerchant());this.selected=t,this._manageTopOfferVisibility(),this._swiperConfig={initialSlide:t}}"loading"!==e||this.loading||(this.listTransactions({...this.pagination,operationGte:Li(this.fromDate),operationLte:Pi()}),this._dispatchEvent(`${this.constructor.is}-load`)),"navigateToManageLinks"===e&&this[e]&&t!==this[e]&&(this._isManageLinksVisible=!0,this._dispatchEvent(`${this.constructor.is}-navigation-to-manage-links-complete`)),"navigateToConfiguration"===e&&this[e]&&t!==this[e]&&(this._isSettingsModalVisible=!0,this._dispatchEvent(`${this.constructor.is}-navigation-to-config-complete`)),"visible"===e&&(this.visible?()=>this.addView(this):()=>this.closeView(this))(),("_refundResquestStatus"===e&&this._refundResquestStatus.requester===this.constructor.is&&this._refundResquestStatus.success||"hasToUpdateOperationsList"===e&&this.hasToUpdateOperationsList)&&this._updateOperationsList(),"isRefundCancelled"===e&&t!==this[e]&&this[e]&&(this._showRefundHandler=!this.isRefundCancelled),"viewDigitalSales"!==e&&"_showTopOffer"!==e||t===this[e]||(this._offersList=[...this._showTopOffer?[{id:"tap-on-phone",active:!1,icon:Y(),event:"top-hire",payload:{upgradeTop:!0}}]:[],...this.viewDigitalSales?[{id:"mpos",active:!1,icon:h(),event:"mpos-hire"}]:[]]),"showSpinnerCarousel"===e&&(this.showSpinnerCarousel?()=>this.showLoader("",this.t(`${this.constructor.is}-loading`)):()=>this.clearLoader())(),"showToastUserSettings"===e&&this.showToastUserSettings&&(this.showNotify(this._getToastDescription(this.dataUserSettings),"","success"),this._dispatchEvent(`${this.constructor.is}-toast-close`))}))}get _onIconClickActions(){return[()=>this._dispatchEvent(`${Fe}-leave`),()=>this._openFaqs(),()=>this._handleOnMenuIconClick({payload:an.is})]}_chargeAgain(){this.visible=!1,this._dispatchEvent(`${this.constructor.is}-go-to-calculator`)}_handleButtonRowClick(t){this._isCalculatorVisible="charge"===$e[t.detail],this._isManageLinksVisible="manage-links"===$e[t.detail],this._isSearchMovementsVisible="search-movements"===$e[t.detail],this._isSeeMoreActionsVisible="see-more-actions"===$e[t.detail],this._isSearchSalesByIdVisible="search-by-id"===$e[t.detail],this._dispatchEvent(`${this.constructor.is}-${$e[t.detail]}`,this.selected)}_handleExecuteRefund(t){this._refundData={...t},this._showRefundHandler=!0}_updateOperationsList(){this.operationsList=[],this._isOperationListLoading=!0,this.resetPagination(),this.listTransactions({...this.pagination,operationGte:Li(this.fromDate),operationLte:Pi()}),this._dispatchEvent(`${this.constructor.is}-has-to-update-operations-list-reset`)}_handleTransactionDetail(t){const{detail:{actions:e,transactionDetail:i}}=t;this._transactionActions=[...e],this.transactionDetail=i,this._isTransactionDetailVisible=!0}_openFaqs(){this._dispatchEvent(`${this.constructor.is}-open-faqs`)}_shareReceipt(t){const{detail:{transactionDetail:e}}=t,i=this.generateDataToReceipt({data:e});this._dispatchEvent("payments-mpos-overview-receipt-share",i)}_sendLink(t){const{detail:{transactionDetail:{checkoutLink:e,amount:i,currency:a}}}=t,s=`${u(a,a)} ${i.toFixed(2)}`,o=this.getSelectedMerchant().name;this._dispatchEvent("payments-mpos-overview-payment-link-send",this.t("payments-mpos-overview-payment-link-msg",{link:e,paymentAmount:s,merchant:o}))}_manageTopOfferVisibility(){const{products:t=[]}=this.getSelectedMerchant();this._showTopOffer=this.hasTopProduct&&this.isTopReady&&!t.some((t=>t.id===hi.TAP_ON_PHONE))}_swipeMerchant(t){const{detail:e}=t,{id:i}=this.getSelectedMerchant();this._swiperConfig={initialSlide:e},this.selected=e;const a=this._merchants[e].id;i!==a&&(this.setSelectedMerchant(a),this._manageTopOfferVisibility(),this._dispatchEvent(`${this.constructor.is}-change-merchant`,a))}_putUserSettings(t){this._dispatchEvent(`${this.constructor.is}-put-user-settings`,t)}_getPaymentsMethods(){return this.getSelectedMerchant().products.flatMap((t=>t.paymentMethods.map((e=>Ti[t.id].paymentMethods[e.id]))))}_getToastDescription(t={}){if(!Object.keys(t).length)return"";if(Object.keys(t).length>1)return this.t(`${this.constructor.is}-toast-several-updates`);const e=t.cardReaderDevice?{name:t.cardReaderDevice.name}:"";return this.t(`${this.constructor.is}-toast-${Object.keys(t)}`,e)}_setRefundResquester(t){this._refundResquestStatus.requester=t}_manageShareVoucherPaymentLinkMethodError(t){t.checkoutLink||"LINK_COBRO"===t.payment_method_name?(this._isShareLinkVoucherError=!0,this._isSdkErrorModalVisible=!0):this._handleShareVoucherModalVisibility(Ne,t.id)}_handleSeeMoreActionsClick(t){const{detail:{action:e}}=t;({"button-charge":()=>this._navigateToCalculator(),"button-manage-links":()=>this._toggleVisibility("_isManageLinksVisible"),"button-search-movements":()=>this._toggleVisibility("_isSearchMovementsVisible"),"button-search-by-id":()=>this._toggleVisibility("_isSearchSalesByIdVisible")})[e](),this._isSeeMoreActionsVisible=!1}_navigateToCalculator(){this._isCalculatorVisible=!0,this._dispatchEvent(`${this.constructor.is}-charge`)}_sendVoucher(t){const{transactionDetail:e}=t.detail;this._handleShareVoucherModalVisibility(e.status===Ge?Ne:He,this.transactionDetail.id)}_toggleVisibility(t){this[t]=!this[t]}get _loadingCarouselTpl(){return[{content:f`
          <payments-mpos-overview-panel-info
            ambient="dark"
            loading
          ></payments-mpos-overview-panel-info>
        `}]}get _merchantsCarouselContent(){const t=[],e=this._merchants.findIndex((t=>t.isDefault));return-1!==e&&this._merchants.unshift(...this._merchants.splice(e,1)),this._merchants.forEach((e=>{t.push({content:f`
          <payments-mpos-overview-panel-info
            description="${this.t(`${this.constructor.is}-description`)}"
            heading-level-title="L"
            link-text="${this.t(`${this.constructor.is}-link-config`)}"
            content-title="${e.name}"
            @payments-mpos-overview-panel-info-click="${()=>{this._isSettingsModalVisible=!0}}"
          ></payments-mpos-overview-panel-info>
        `})})),t}_listOfferTpl(t,e=!1){const{id:i,event:a,icon:s,payload:o}=t;return f`<payments-mpos-overview-list-offer
      ambient="primary"
      ?carousel-item="${e}"
      description="${this.t(`${this.constructor.is}-${i}-offer-description`)}"
      icon="${s}"
      link-text="${this.t(`${this.constructor.is}-offer-link`)}"
      title-font-weight="500"
      title-size="XL"
      title-text="${this.t(`${this.constructor.is}-${i}-offer-title`)}"
      ?loading="${this.loading}"
      @payments-mpos-overview-list-offer-action-click="${()=>{this._dispatchEvent(`${this.constructor.is}-${a}`,o),this._dispatchEvent(`${this.constructor.is}-action-click`,a)}}"
    ></payments-mpos-overview-list-offer>`}get _carouselOffersContent(){const t=[];return this._offersList.forEach((e=>{e.active||t.push({content:this._listOfferTpl(e,true)})})),t}get _merchantsCarouselTpl(){return f`
      <bbva-carousel-default
        type="swipe"
        .selected="${this.selected}"
        .swiperConfig="${this._swiperConfig}"
        .items="${0===this._merchants.length?this._loadingCarouselTpl:this._merchantsCarouselContent}"
        .scopedComponents="${[{tagName:"payments-mpos-overview-panel-info",class:ws}]}"
        @carousel-default-item-select="${t=>this._swipeMerchant(t)}"
      ></bbva-carousel-default>
    `}get _carouselOffersTpl(){return f`<bbva-carousel-default
      class="carousel-offers"
      variant="two-columns"
      .items="${this._merchants.length?this._carouselOffersContent:this._loadingCarouselTpl}"
      .scopedComponents="${[{tagName:"payments-mpos-overview-list-offer",class:jo}]}"
    ></bbva-carousel-default>`}get _offersTpl(){return(this._showTopOffer||this.viewDigitalSales)&&!this._isOperationListLoading&&this._offersList.length?f`
          <bbva-header-category
            heading-level="2"
            text="${this.t(`${this.constructor.is}-carousel-offers-title`)}"
            ?loading="${this.loading}"
          ></bbva-header-category>
          ${this._offersList.length>1?this._carouselOffersTpl:this._listOfferTpl(this._offersList[0])}
        `:f``}get _buttonRowTpl(){const t=[{icon:r(),label:this.t(`${this.constructor.is}-button-charge`)},{icon:l(),label:this.t(`${this.constructor.is}-button-manage-links`)},{icon:d(),label:this.t(`${this.constructor.is}-button-search-movements`)},{icon:W(),label:this.t(`${this.constructor.is}-button-see-more`)}];return f`
      <bbva-button-row
        ambient="primary"
        variant="simple"
        ?loading="${this.loading}"
        .options="${t}"
        @button-row-item-click="${this._handleButtonRowClick}"
      ></bbva-button-row>
    `}get _headerMainButtons(){return[...this.showHelpFaqs?[{id:`${this.constructor.is}-btn-help`,icon:E(),accessibilityText:this.t(`${this.constructor.is}-faqs`)}]:[],{id:`${this.constructor.is}-btn-menu`,icon:J(),accessibilityText:this.t(`${this.constructor.is}-global-menu`)}]}get _lastChargesModalTpl(){return f`
      <payments-mpos-overview-last-charges-modal
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${this._isLastChargesModalVisible}"
        @payments-mpos-overview-last-charges-modal-close="${()=>{this._isLastChargesModalVisible=!1}}"
      ></payments-mpos-overview-last-charges-modal>
    `}get _manageLinksTpl(){return f`
      <payments-mpos-overview-manage-links
        commission="${this.commission}"
        currency-code="${this.currencyCode}"
        language="${this.language}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?is-edit-link-date-visible="${this._isEditLinkDateVisible}"
        ?show-cancel-link-warning="${this._showCancelLinkWarning}"
        ?visible="${this._isManageLinksVisible}"
        .datePickerData="${this.datePickerData}"
        .datePickerError="${this.datePickerError}"
        .filterTypeStatusLink="${this.filterTypeStatusLink}"
        .fromDate="${this.fromDate}"
        .pageSize="${this.pageSize}"
        .refundResquestStatus="${this._refundResquestStatus}"
        @payments-mpos-overview-manage-links-button-search="${()=>{this._isSearchMovementsVisible=!0}}"
        @payments-mpos-overview-manage-links-close="${()=>{this._updateOperationsList(),this._isManageLinksVisible=!1}}"
        @payments-mpos-overview-operations-list-operation-click="${t=>{this._setRefundResquester(tn),this._handleTransactionDetail(t)}}"
        @payments-mpos-overview-operations-list-payment-voucher-share="${({detail:{transactionDetail:t}})=>this._manageShareVoucherPaymentLinkMethodError(t)}"
        @payments-mpos-overview-edit-link-date-modal-close="${()=>{this._isEditLinkDateVisible=!1}}"
        @payments-mpos-overview-manage-links-close-warning-modal="${()=>{this._showCancelLinkWarning=!1}}"
        @payments-mpos-overview-manage-links-not-visible="${()=>{this._isManageLinksVisible=!1}}"
        @payments-mpos-overview-manage-links-update-transaction-actions="${t=>{this._transactionActions=[...t.detail]}}"
        @payments-mpos-overview-operations-list-money-return="${t=>{this._setRefundResquester(tn),this._handleExecuteRefund(t.detail.transactionDetail)}}"
      >
      </payments-mpos-overview-manage-links>
    `}get _operationsListTpl(){return f`
      <payments-mpos-overview-operations-list
        language="${this.language}"
        last-charges-header-enabled
        limit="${this.pagination.limit}"
        offset="${this.pagination.offset}"
        ?dashboard-transactions-list-failed="${this.dashboardTransactionsListFailed}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?loading="${this._isOperationListLoading}"
        ?should-reset-error-props="${this.hasToUpdateOperationsList}"
        .fromDate="${this.fromDate}"
        .hasMoreElements="${!!this.hasMoreElements}"
        .operationsList="${this.operationsList}"
        @payments-mpos-overview-operations-list-retry-list-transactions-call="${()=>{this.operationsList=[],this.resetPagination(),this.listTransactions({...this.pagination,operationGte:Li(this.fromDate),operationLte:Pi()})}}"
        @payments-mpos-overview-operations-list-more-operations-request="${t=>{this.updatePagination(t.detail),this.listTransactions({...t.detail,operationGte:Li(this.fromDate),operationLte:Pi()})}}"
        @payments-mpos-overview-operations-list-search-movements-navigate="${()=>{this._isSearchMovementsVisible=!0}}"
        @payments-mpos-overview-operations-list-last-charges-modal-open="${()=>{this._isLastChargesModalVisible=!0}}"
        @payments-mpos-overview-operations-list-operation-click="${t=>{this._setRefundResquester(this.constructor.is),this._handleTransactionDetail(t)}}"
        @payments-mpos-overview-operations-list-receipt-share="${this._shareReceipt}"
        @payments-mpos-overview-operations-list-payment-voucher-share="${({detail:{transactionDetail:t}})=>this._manageShareVoucherPaymentLinkMethodError(t)}"
        @payments-mpos-overview-operations-list-money-return="${t=>{this._setRefundResquester(this.constructor.is),this._handleExecuteRefund(t.detail.transactionDetail)}}"
        @payments-mpos-overview-operations-list-loading-stop="${()=>{this._isOperationListLoading=!1,this._dispatchEvent(`${this.constructor.is}-operations-list-loading-stop`)}}"
      >
      </payments-mpos-overview-operations-list>
    `}get _refundHandlerTpl(){return f`
      <payments-mpos-overview-refund-handler
        commission="${this.commission}"
        currency-code="${this.currencyCode}"
        language="${this.language}"
        mode="dashboard"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?is-card-reader-settings-visible="${this._showRefundScanDevicesModal}"
        ?is-top-ready="${this.isTopReady}"
        ?visible="${this._showRefundHandler}"
        .singleUseJws="${this.singleUseJws}"
        .transactionData="${this._refundData}"
        @payments-mpos-overview-refund-receipt-modal-charge="${this._chargeAgain}"
        @payments-mpos-overview-refund-handler-refund-cancel="${()=>{this._showRefundHandler=!1,this._showRefundScanDevicesModal=!1}}"
        @payments-mpos-overview-refund-receipt-modal-voucher-share="${()=>this._handleShareVoucherModalVisibility(He,this._refundData.id)}"
        @payments-mpos-overview-exit-receipt="${()=>{this._showRefundHandler=!1}}"
        @payments-mpos-overview-refund-handler-refund-success="${()=>{this._refundResquestStatus={...this._refundResquestStatus,success:!0},this._isTransactionDetailVisible=!1}}"
        @payments-mpos-overview-card-reader-settings-close="${()=>{this._showRefundHandler=!1,this._showRefundScanDevicesModal=!1}}"
        @payments-mpos-overview-refund-receipt-modal-receipt-share="${t=>{const e=t.detail;this._shareReceipt({detail:{transactionDetail:e}})}}"
      ></payments-mpos-overview-refund-handler>
    `}get _shareVoucherTpl(){return f`
      <payments-mpos-overview-share-voucher-modal
        transaction-id="${this.transactionId}"
        type="${this._shareVoucherType}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${this._isShareVoucherModalVisible}"
        @payments-mpos-overview-share-voucher-modal-close="${()=>{this._isShareVoucherModalVisible=!1}}"
      >
      </payments-mpos-overview-share-voucher-modal>
    `}get _searchMovementsModalTpl(){var t;return null!==(t=this._merchants)&&void 0!==t&&t.length?f`
          <payments-mpos-overview-search-movements
            language="${this.language}"
            page-size="${this.pageSize}"
            search-type="payment-methods"
            ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
            ?visible="${this._isSearchMovementsVisible}"
            .datePickerData="${this.datePickerData}"
            .datePickerError="${this.datePickerError}"
            .fromDate="${this.fromDate}"
            .pageSize="${this.pageSize}"
            .paymentMethods="${this._getPaymentsMethods()}"
            .refundResquestStatus="${this._refundResquestStatus}"
            @payments-mpos-overview-search-movements-close="${()=>{this._updateOperationsList(),this._isSearchMovementsVisible=!1}}"
            @payments-mpos-overview-search-movements-payment-methods-results-click="${()=>{this._isSearchMovementsVisible=!1}}"
            @payments-mpos-overview-operations-list-operation-click="${t=>this._handleTransactionDetail(t)}"
            @payments-mpos-overview-operations-list-payment-voucher-share="${({detail:{transactionDetail:t}})=>this._manageShareVoucherPaymentLinkMethodError(t)}"
            @payments-mpos-overview-operations-list-money-return="${t=>{this._setRefundResquester(en),this._handleExecuteRefund(t.detail.transactionDetail)}}"
          >
          </payments-mpos-overview-search-movements>
        `:""}get _seeMoreActionsTpl(){return f`
      <payments-mpos-overview-see-more-actions
        ?visible="${this._isSeeMoreActionsVisible}"
        .actions="${ai}"
        @payments-mpos-overview-see-more-actions-choose-action="${t=>this._handleSeeMoreActionsClick(t)}"
        @payments-mpos-overview-see-more-actions-close="${()=>{this._isSeeMoreActionsVisible=!1}}"
      >
      </payments-mpos-overview-see-more-actions>
    `}get _settingsTpl(){return f`
      <payments-mpos-overview-settings-modal
        ?default-merchant-exists="${this.getDefaultMerchantExists()}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?should-close-card-reader-settings="${this._shouldCloseCardReaderSettings}"
        ?show-toggle="${this._merchants.length>1}"
        ?visible="${this._isSettingsModalVisible}"
        .selectedMerchant="${this.getSelectedMerchant()}"
        .sdkErrorResponse="${this.sdkErrorResponse}"
        .taxTypes="${this.taxTypes}"
        .validPeriodTypes="${this.validPeriodTypes}"
        @payments-mpos-overview-settings-modal-click-cta-btn="${t=>{this._putUserSettings(t.detail)}}"
        @payments-mpos-overview-settings-modal-click-period-link="${t=>this._putUserSettings(t.detail)}"
        @payments-mpos-overview-settings-modal-new-device-select="${t=>this._putUserSettings(t.detail)}"
        @payments-mpos-overview-settings-modal-close="${()=>{this._isSettingsModalVisible=!1,this._shouldCloseCardReaderSettings=!1}}"
        @payments-mpos-overview-settings-modal-card-reader-settings-close="${()=>{this._shouldCloseCardReaderSettings=!1}}"
      >
      </payments-mpos-overview-settings-modal>
    `}get _searchSalesByIdTpl(){return f`
      <payments-mpos-overview-search-sales-by-id
        language="${this.language}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${this._isSearchSalesByIdVisible}"
        .fromDate="${this.fromDate}"
        @payments-mpos-overview-search-sales-by-id-close="${()=>{this._isSearchSalesByIdVisible=!1}}"
        @payments-mpos-overview-search-sales-by-id-operation-click="${t=>{this._handleTransactionDetail(t)}}"
        @payments-mpos-overview-operations-list-operation-click="${t=>this._handleTransactionDetail(t)}"
        @payments-mpos-overview-operations-list-payment-voucher-share="${({detail:{transactionDetail:t}})=>this._manageShareVoucherPaymentLinkMethodError(t)}"
        @payments-mpos-overview-operations-list-money-return="${t=>{this._setRefundResquester(en),this._handleExecuteRefund(t.detail.transactionDetail)}}"
        @payments-mpos-overview-operations-list-receipt-share="${this._shareReceipt}"
      >
      </payments-mpos-overview-search-sales-by-id>
    `}get _businessIntelligenceCardTpl(){return this.showBICard?f`
          <bbva-notification-contextual
            body-text="${this.t(`${this.constructor.is}-card-description`)}"
            head-title="${this.t(`${this.constructor.is}-card-title`)}"
            icon-close
            link-text="${this.t(`${this.constructor.is}-card-link`)}"
            ?loading="${this.loading}"
            @notification-contextual-icon-click="${t=>{t.stopPropagation(),this.showBICard=!1}}"
            @notification-contextual-link-click="${()=>{this._dispatchEvent(`${Fe}-navigate-to-all-merchants`)}}"
          ></bbva-notification-contextual>
        `:f``}get _sdkErrorModalsTpl(){return f`
      <payments-mpos-overview-sdk-error-modals
        ?is-refund="${this._showRefundHandler}"
        ?is-share-link-voucher="${this._isShareLinkVoucherError}"
        ?visible="${this._isSdkErrorModalVisible}"
        .sdkErrorResponse="${this.sdkErrorResponse}"
        @payments-mpos-overview-sdk-error-modals-sdk-not-controlled-open="${()=>{this._isSdkErrorModalVisible=!0}}"
        @payments-mpos-overview-sdk-error-modals-close="${()=>{this._isSdkErrorModalVisible=!1}}"
        @payments-mpos-overview-sdk-error-modals-retry-new-devices-scan-call="${()=>{this._isSdkErrorModalVisible=!1,this.scanNewDevices()}}"
        @payments-mpos-overview-sdk-error-modals-retry-scan-devices-call="${()=>{this.scanNewDevices(),this._isSdkErrorModalVisible=!1}}"
        @payments-mpos-overview-sdk-error-modals-retry-connect-to-bluetooth-device-call="${()=>{this.connectToBluetoothDevice(),this._isSdkErrorModalVisible=!1}}"
        @payments-mpos-overview-sdk-error-modals-user-close="${()=>{this._isSdkErrorModalVisible=!1,this._isSearchMovementsVisible=!1,this._shouldCloseCardReaderSettings=!0,this._showRefundHandler=!1}}"
        @payments-mpos-overview-phone-settings-open="${()=>{this._isSdkErrorModalVisible=!1,this._shouldCloseCardReaderSettings=!0,this._showRefundHandler=!1}}"
        @payments-mpos-overview-sdk-error-modals-controlled-error-found="${()=>{this._isSdkErrorModalVisible=!0}}"
        @payments-mpos-overview-sdk-error-modals-refund-new-devices-scan="${()=>{this._showRefundScanDevicesModal=!0,this._isSdkErrorModalVisible=!1}}"
      >
      </payments-mpos-overview-sdk-error-modals>
    `}get _transactionDetailTpl(){var t;return f`
      <payments-mpos-overview-transaction-detail
        language="${this.language}"
        commission="${this.commission}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?is-link-management="${!(null===(t=this.transactionDetail)||void 0===t||!t.checkoutLink)}"
        ?visible="${this._isTransactionDetailVisible}"
        .actions="${this._transactionActions}"
        .transactionDetail="${this.transactionDetail}"
        @payments-mpos-overview-transaction-detail-close="${()=>{this._isTransactionDetailVisible=!1}}"
        @payments-mpos-overview-transaction-detail-receipt-share="${this._shareReceipt}"
        @payments-mpos-overview-transaction-detail-payment-link-send="${this._sendLink}"
        @payments-mpos-overview-transaction-detail-card-present-payment-voucher-share="${t=>this._sendVoucher(t)}"
        @payments-mpos-overview-transaction-detail-tap-on-phone-payment-voucher-share="${t=>this._sendVoucher(t)}"
        @payments-mpos-overview-transaction-detail-payment-link-payment-voucher-share="${()=>{this._isShareLinkVoucherError=!0,this._isSdkErrorModalVisible=!0}}"
        @payments-mpos-overview-transaction-detail-date-edit="${()=>{this._isEditLinkDateVisible=!0}}"
        @payments-mpos-overview-transaction-detail-link-cancel="${()=>{this._showCancelLinkWarning=!0}}"
        @payments-mpos-overview-transaction-detail-not-visible="${()=>{this._isTransactionDetailVisible=!1}}"
        @payments-mpos-overview-transaction-detail-money-return="${()=>{this._handleExecuteRefund(this.transactionDetail)}}"
      ></payments-mpos-overview-transaction-detail>
    `}render(){return f`
      <bbva-transition-container reset-scroll ?visible="${this.visible}">
        <div slot="slot-header">
          <bbva-header-main
            show-left-icon
            variant="first-level-sequential"
            text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}`)}"
            .buttons="${this._headerMainButtons}"
            @header-main-icon-click="${t=>{const{index:e}=t.detail;this._onIconClickActions[e](),t.stopPropagation()}}"
          >
          </bbva-header-main>
        </div>
        <div slot="slot-content">
          ${this._merchantsCarouselTpl} ${this._buttonRowTpl}
          <div class="cards-container">${this._businessIntelligenceCardTpl} ${this._offersTpl}</div>
          ${this._operationsListTpl}
        </div>
      </bbva-transition-container>

      ${this._searchMovementsModalTpl}${this._searchSalesByIdTpl}${this._seeMoreActionsTpl}${this._settingsTpl}
      ${this._manageLinksTpl}${this._transactionDetailTpl}${this._lastChargesModalTpl}
      ${this._shareVoucherTpl}${this._refundHandlerTpl}${this._sdkErrorModalsTpl}
    `}}const sn=t((t=>class extends(m(_e(t))){retryErrorApiEvent({errorId:t,viewMode:e}){this._dispatchEvent(`${Fe}-retry-error`,e?this[`_${e}InfoNotLoaded`](t):this._unfinishedOperations(t))}_dashboardInfoNotLoaded(t){return{retryErrorData:{errorId:t,errorType:"informationNotLoaded",retryConfig:{cancelBtLabel:`${Fe}-error-go-back`,className:"error dark-header header-button-to-left",closeIcon:"coronita:return-12",header:`${Fe}-error-info-not-loaded-header`,message:`${Fe}-retry-error-info-not-loaded-msg`,srcImage:"./images/errors/fo_error.svg"},callConfig:{acceptBtLabel:`${Fe}-retry-error-call-help-btn`,cancelBtLabel:`${Fe}-error-go-back`,className:"error dark-header header-button-to-left",closeIcon:"coronita:return-12",header:`${Fe}-error-info-not-loaded-header`,message:`${Fe}-retry-error-info-not-loaded-call-help-msg`,srcImage:"./images/errors/fo_error.svg",onAcceptEvent:()=>this._dispatchEvent(`${Fe}-call-action-open`)}}}}_calculatorInfoNotLoaded(t){return{retryErrorData:{errorId:t,errorType:"informationNotLoaded",retryConfig:{cancelBtLabel:`${Fe}-retry-error-info-not-loaded-close-btn`,header:`${Fe}-error-info-not-loaded-header`,message:`${Fe}-retry-error-info-not-loaded-msg`,srcImage:"./images/errors/fo_error.svg"},callConfig:{acceptBtLabel:`${Fe}-retry-error-call-help-btn`,cancelBtLabel:`${Fe}-retry-error-info-not-loaded-close-btn`,header:`${Fe}-error-info-not-loaded-header`,message:`${Fe}-retry-error-info-not-loaded-call-help-msg`,srcImage:"./images/errors/fo_error.svg",onAcceptEvent:()=>this._dispatchEvent(`${Fe}-call-action-open`)}}}}_unfinishedOperations(t){return{retryErrorData:{errorId:t,errorType:"unfinishedOperations",retryConfig:{cancelBtLabel:`${Fe}-retry-error-unfinished-operations-exit-btn`,className:"full-height-error",fullModal:!0,header:`${Fe}-retry-error-unfinished-operations-header`,message:`${Fe}-retry-error-unfinished-operations-msg`,srcImage:"./images/errors/fo_error.svg",title:`${Fe}-retry-error-unfinished-operations-title`},callConfig:{acceptBtLabel:`${Fe}-retry-error-call-help-btn`,cancelBtLabel:`${Fe}-retry-error-unfinished-operations-exit-btn`,className:"full-height-error",fullModal:!0,header:`${Fe}-retry-error-unfinished-operations-header`,message:`${Fe}-retry-error-unfinished-operations-call-help-msg`,srcImage:"./images/errors/fo_error.svg",title:`${Fe}-retry-error-unfinished-operations-title`,onAcceptEvent:()=>this._dispatchEvent(`${Fe}-call-action-open`)}}}}})),on="callMerchants",nn="callGetUserSettings",rn="putUserSettings",ln="callSSO";class dn extends(K(tt(Qi(_e(sn(ea(na(Zi(_))))))))){static get is(){return"payments-mpos-overview-dm"}static get scopedElements(){const t=[he,pe,me];return dn.scopedElementsFromClasses(t)}static get properties(){return{apiVersion:{type:Number,attribute:"api-version"},applicationId:{type:String,attribute:"application-id"},componentId:{type:String,attribute:"component-id"},customerId:{type:String,attribute:"customer-id"},hasBeenCheckedStorageNoData:{type:Boolean,attribute:"has-been-checked-storage-no-data"},hasBeenCheckedJWSStorage:{type:Boolean,attribute:"has-been-checked-jws-storage"},pageSize:{type:Number,attribute:"page-size"},products:{type:Array},resetCall:{type:Boolean,attribute:"reset-call"},reusableThirdPartyServiceId:{type:String,attribute:"reusable-third-party-service-id"},storagedData:{type:Object,attribute:"storaged-data"},storagedJWS:{type:Array,attribute:"storaged-jws"},thirdPartyProviderId:{type:String,attribute:"third-party-provider-id"},thirdPartyServiceId:{type:String,attribute:"third-party-service-id"},userSettingsEnabled:{type:Boolean,attribute:"user-settings-enabled"},viewMode:{type:String,attribute:"view-mode"},_isLastUserSettingsRequestEmptyFetch:{type:Boolean},_merchantsHaveBeenSet:{type:Boolean},_merchantsStoredFromLocal:{type:Array}}}constructor(){super(),this.apiVersion=null,this.applicationId="",this.callSSOWithTTLValidate=this.ttlGuardCallSSO(this.callSSO,this._handleSSOSuccess),this.componentId="",this.customerId="",this.hasBeenCheckedJWSStorage=!1,this.hasBeenCheckedStorageNoData=!1,this.host="",this.pageSize=10,this.products=[],this.requiredToken="",this.resetCall=!1,this.reusableThirdPartyServiceId="",this.storagedData={},this.storagedJWS=[],this.thirdPartyProviderId="",this.thirdPartyServiceId="",this.userSettingsEnabled=!1,this.viewMode="",this._customerHasBeenChecked=!1,this._dataUpdateToUserSettings={},this._formattedUserSettingsData=[],this._handleMerchantsError=this._invalidTsecGuard(this._handleMerchantsError),this._handleSSOError=this._invalidTsecGuard(this._handleSSOError),this._handleUserSettingsError=this._invalidTsecGuard(this._handleUserSettingsError),this._hasMerchantsPagination=!1,this._isLastRequestErrorInvalidTsec=!1,this._isLastUserSettingsRequestEmptyFetch=!1,this._isMerchantsStoredWithoutJWSTTL=!1,this._isOnboardingDone=!1,this._isUnavailableTop=!1,this._isSingleUseJws=!1,this._lastSavedCallData={},this._merchantId="",this._merchantsAcc=[],this._merchantsHaveBeenSet=!1,this._merchantsPaginationKey=0,this._merchantsStore=[],this._merchantsStoredFromLocal=[],this._totalMerchantsPages=0}firstUpdated(t){super.firstUpdated(t),this._merchantsDm=this.shadowRoot.querySelector(`[data-tag-name="${pe.is}"]`),this._ssoDm=this.shadowRoot.querySelector(`[data-tag-name="${me.is}"]`),this._userSettingsDm=this.shadowRoot.querySelector(`[data-tag-name="${he.is}"]`)}updated(t){t.has("hasBeenCheckedStorageNoData")&&this.hasBeenCheckedStorageNoData&&!this._merchantsStoredFromLocal.length&&this.callMerchants(),t.has("storagedData")&&Object.values(this.storagedData).length&&this.retrievedDataFromLocalStorage(this.storagedData),t.has("_merchantsStoredFromLocal")&&this._merchantsStoredFromLocal.length&&!this._merchantsHaveBeenSet&&this._setStoredConfig(),(t.has("hasBeenCheckedJWSStorage")||t.has("_merchantsHaveBeenSet")||t.has("customerId"))&&this.hasBeenCheckedJWSStorage&&this._merchantsHaveBeenSet&&this._customerHasBeenChecked&&this._manageJWSFromStorage(this.storagedJWS),t.has("customerId")&&(this._customerHasBeenChecked=!0)}callMerchants(){this._lastSavedCallData={functionName:on},this._merchantsDm.postThirdPartyProviderMerchantsSearch(this.thirdPartyProviderId,{customerId:this.customerId,pageSize:this.pageSize,paginationKey:this._merchantsPaginationKey,products:this.products})}callGetUserSettings(){this._lastSavedCallData={functionName:nn},this._userSettingsDm.getApplicationComponent(this.applicationId,this.componentId)}callSSO({id:t=this._merchantId,onlyOneUse:e=!1}={}){this._lastSavedCallData={id:t,onlyOneUse:e,functionName:ln},this._isSingleUseJws=e,this._merchantId=t,this._ssoDm.postThirdPartyProviderSingleSignOnOpenpayDashboard(this.thirdPartyProviderId,{customerId:this.customerId,merchantId:this._merchantId||this.getSelectedMerchant().id,thirdPartyServiceID:e?this.thirdPartyServiceId:this.reusableThirdPartyServiceId})}repeatLastCall(){const{functionName:t,...e}=this._lastSavedCallData;this[t](e)}putUserSettings(t){const e=this.getUserSettings();if(t.isDefault&&e.forEach(((t,i)=>{e[i]={...t,isDefault:!1}})),t)if(this.userSettingsEnabled){this._lastSavedCallData={...t,functionName:rn};const i=e.findIndex((t=>t.merchantId===this.getSelectedMerchant().id));if(-1===i){const i=this._formatUserSettingsData(this.getSelectedMerchant());Object.entries(t).forEach((([t,e])=>{i[t]=e})),e.push(i)}else Object.entries(t).forEach((([t,a])=>{e[i][t]=a}));this._dataUpdateToUserSettings={userSettings:e,data:t},this._userSettingsDm.putApplicationComponent(this.applicationId,this.componentId,{value:JSON.stringify({merchants:e})})}else this._dataUpdateToUserSettings={userSettings:e,data:t},this._putUserSettingsResponse()}retrievedDataFromLocalStorage(t){const{ttl:e,isOpenPayUser:i,merchants:a,isOnboardingDone:s,unavailableTop:o}=t;this._isOnboardingDone=!!s,this._isUnavailableTop=!!o,o&&this.setPropertyToStore("unavailableTop",!0),s&&this.setPropertyToStore("isOnboardingDone",!0,false),i&&!Ii(e)?(this.setMerchantsTtl(e),this._merchantsStoredFromLocal=a):(this._merchantsStoredFromLocal=[],this._merchantsAcc=[],this.setMerchantsTtl(Ri()),this.callMerchants())}_manageJWSFromStorage(t){const e=t.find((t=>t.id===this.getSelectedMerchant().id));null!=e&&e.ttl&&!Ii(e.ttl)?(this.setMerchantJws(e.jws,e.ttl),this._dispatchEvent(`${this.constructor.is}-responses-success`,{showOnboarding:!this._isOnboardingDone,unavailableTop:this._isUnavailableTop})):this.callSSO()}_handleMerchantsAndUserSettingsSuccess(){this._merchantsStore=this._mapResponsesToMerchantsStore();const t=this._merchantsStoredFromLocal.length?this._merchantsStoredFromLocal:this._merchantsStore;this.setMerchants(t,!this._merchantsStoredFromLocal.length),this._merchantsHaveBeenSet=!0}_handleMerchantsRespone(t){var e;const{detail:i}=t;null!==(e=i.merchants)&&void 0!==e&&e.length?(this._merchantsAcc=[...this._merchantsAcc,...i.merchants],this._handleMerchantsPagination(i.pagination),this.resetCall&&(this._manageJWSFromStorage(this.storagedJWS),this.resetCall=!1),this._handleHasMerchantsPagination(this._hasMerchantsPagination)):this._dispatchEvent(`${this.constructor.is}-merchants-no-data`)}_handleMerchantsPagination(t){this._totalMerchantsPages=t.totalPages-1,this._hasMerchantsPagination=this._merchantsPaginationKey!==this._totalMerchantsPages,this._hasMerchantsPagination&&(this._merchantsPaginationKey+=1)}_handleHasMerchantsPagination(t){var e;t?this.callMerchants():(this._merchantId=null===(e=this._merchantsAcc[0])||void 0===e?void 0:e.id,this.userSettingsEnabled?this.callGetUserSettings():this._handleMerchantsAndUserSettingsSuccess())}_handleMerchantsError(){this.retryErrorApiEvent({errorId:"third-party-provider-merchants-search-api-dm-fetch-error",viewMode:this.viewMode})}_handleUserSettingsError(){let t={errorId:"application-component-api-dm-fetch-error",viewMode:this.viewMode};if(Object.keys(this._dataUpdateToUserSettings).length)this._dispatchEvent(`${this.constructor.is}-update-user-setting-error`,this._dataUpdateToUserSettings),t={errorId:"application-component-api-dm-put-error"};else if(this._isLastUserSettingsRequestEmptyFetch)return this._handleMerchantsAndUserSettingsSuccess(),void(this._isLastUserSettingsRequestEmptyFetch=!1);this.retryErrorApiEvent(t)}_handleUserSettingsFetchError(){this._isLastUserSettingsRequestEmptyFetch=!0}_handleSSOError(){this.retryErrorApiEvent({errorId:this._isSingleUseJws?"third-party-provider-single-sign-on-openpay-dashboard-single-use-api-dm-fetch-error":"third-party-provider-single-sign-on-openpay-dashboard-api-dm-fetch-error",viewMode:this.viewMode}),this.clearLoader()}_invalidTsecGuard(t){return e=>{if(!this._isLastRequestErrorInvalidTsec)return t.bind(this)({...e});this._isLastRequestErrorInvalidTsec=!1}}_handleSSORespone(t){const{detail:{jws:e}}=t;if(this._isSingleUseJws)this._dispatchEvent(`${this.constructor.is}-single-use-sso-success`,{jws:e}),this.clearLoader();else{const t=(({hours:t,minutes:e})=>moment.utc().add(t,"hours").add(e,"minutes").toISOString())(ri);this._setJWSToStogare(e,t),this.setMerchantJws(e,t),this._handleSSOSuccess()}}_setJWSToStogare(t,e){var i;const a=null===(i=this.getSelectedMerchant())||void 0===i?void 0:i.id,s=this.storagedJWS.find((t=>a===t.id)),o={id:a,jws:t,ttl:e};if(s){const t=this.storagedJWS.findIndex((t=>a===t.id));this.storagedJWS[t]=o}else this.storagedJWS.push(o);this.setOnLocalStorage(di,this.storagedJWS,!0)}_handleSSOSuccess(){this._dispatchEvent(`${this.constructor.is}-sso-success`),this._dispatchEvent(`${this.constructor.is}-responses-success`,{showOnboarding:!this._isOnboardingDone,unavailableTop:this._isUnavailableTop})}_getUserSettingsResponse(t){const{detail:e}=t;this._formattedUserSettingsData=JSON.parse(e.value).merchants,this.setUserSettings(this._formattedUserSettingsData),this._handleMerchantsAndUserSettingsSuccess()}_putUserSettingsResponse(){const{data:t,userSettings:e}=this._dataUpdateToUserSettings;this.setUserSettings(e);const i=this.getMerchants();t.isDefault&&i.forEach(((t,e)=>{i[e]={...t,isDefault:!1}}));const a=i.findIndex((t=>t.id===this.getSelectedMerchant().id));-1!==a&&Object.entries(t).forEach((([t,e])=>{i[a][t]=e})),this.setMerchants(i),this._dispatchEvent(`${this.constructor.is}-user-settings-put-success`,t),this.clearLoader(),this.navigateBack(),this._dataUpdateToUserSettings={}}_invalidTsecApi(t){var e,i,a;const s=null==t?void 0:t.detail["http-status"],o=null==t||null===(e=t.detail)||void 0===e||null===(i=e.messages)||void 0===i||null===(a=i[0])||void 0===a?void 0:a.code;(!s||(401===s||0===s||"SAS_68"===o))&&(this._isLastRequestErrorInvalidTsec=!0,this._customerHasBeenChecked=!1,this._dispatchEvent(`${this.constructor.is}-login-navigate`))}_mapResponsesToMerchantsStore(){return this._formattedUserSettingsData.length?this._merchantsAcc.map((t=>{const e=this._formattedUserSettingsData.find((e=>e.merchantId===t.id));return this._formatMerchant(t,e)})):this._merchantsAcc.map((t=>this._formatMerchant(t)))}_formatMerchant(t,e={}){return{id:t.id||t.merchantId,name:e.name||t.name,isDefault:e.isDefault||t.isDefault||!1,isSelected:!1,cardReaderDevice:e.cardReaderDevice||t.cardReaderDevice||{},defaultIVAId:e.defaultIVAId||t.defaultIVAId||"",validPeriodPaymentLinkId:e.validPeriodPaymentLinkId||t.validPeriodPaymentLinkId||"",products:e.products||t.products}}_formatUserSettingsData(t){return{merchantId:t.id,isDefault:t.isDefault||!1,...t.cardReaderDevice?{cardReaderDevice:t.cardReaderDevice}:{},defaultIVAId:t.defaultIVAId||"",validPeriodPaymentLinkId:t.validPeriodPaymentLinkId||""}}_setStoredConfig(){const t=this._merchantsStoredFromLocal.map((({id:t,cardReaderDevice:e,defaultIVAId:i,validPeriodPaymentLinkId:a,isDefault:s})=>({cardReaderDevice:e,defaultIVAId:i,merchantId:t,isDefault:s||!1,validPeriodPaymentLinkId:a})));this.setUserSettings(t),this._handleMerchantsAndUserSettingsSuccess()}get _dataManagersTpl(){return f`
      <bbva-global-third-party-provider-merchants-search-api-dm
        ?native="${this.native}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.apiVersion}"
        @third-party-provider-merchants-search-api-dm-fetch="${this._handleMerchantsRespone}"
        @third-party-provider-merchants-search-api-dm-pagination="${this._handleMerchantsPagination}"
        @api-dm-response-error="${this._handleMerchantsError}"
        @api-dm-error="${this._invalidTsecApi}"
      ></bbva-global-third-party-provider-merchants-search-api-dm>
      <bbva-global-third-party-provider-single-sign-on-openpay-dashboard-api-dm
        ?native="${this.native}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.apiVersion}"
        @third-party-provider-single-sign-on-openpay-dashboard-api-dm-fetch="${this._handleSSORespone}"
        @api-dm-response-error="${this._handleSSOError}"
        @api-dm-error="${this._invalidTsecApi}"
      ></bbva-global-third-party-provider-single-sign-on-openpay-dashboard-api-dm>
      <bbva-global-application-component-api-dm
        ?native="${this.native}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.apiVersion}"
        @application-component-api-dm-fetch="${this._getUserSettingsResponse}"
        @api-dm-response-error="${this._handleUserSettingsError}"
        @application-component-api-dm-fetch-error="${this._handleUserSettingsFetchError}"
        @application-component-api-dm-update="${this._putUserSettingsResponse}"
        @api-dm-error="${this._invalidTsecApi}"
      ></bbva-global-application-component-api-dm>
    `}render(){return f` ${this._dataManagersTpl} `}}var cn=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class hn extends(D(m(_e(na(_))))){static get is(){return"payments-mpos-overview-faqs-modal"}static get scopedElements(){const t=[kt,ue];return hn.scopedElementsFromClasses(t)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},contentFragmentPathFaqs:{type:String,attribute:"content-fragment-path-faqs"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},native:{type:Boolean},visible:{type:Boolean},_isAnswerVisible:{type:Boolean}}}static get styles(){return[cn,$("payments-mpos-overview-faqs-modal-shared-styles")]}constructor(){super(),this.aemHost="",this.contentFragmentPathFaqs="",this.hasFeatureHeaderHidden=!1,this.native=!1,this.visible=!1,this._isAnswerVisible=!1}updated(t){t.forEach(((t,e)=>{"visible"===e&&(this.visible?()=>this.addView(this):()=>this.closeView(this))()}))}_handleCloseModal(t){t.stopPropagation(),this.visible=!1,this._dispatchEvent(`${this.constructor.is}-close`)}get _faqModal(){return f`
      <help-faqs-aem
        host="${this.aemHost}"
        content-fragment-path="${this.contentFragmentPathFaqs}"
        ?native="${this.native}"
      >
      </help-faqs-aem>
    `}render(){return f`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t(`${this.constructor.is}-close-modal`)}"
        header-text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-header-text`)}"
        header-type="modal"
        fixed-footer
        full-height
        hide-content-padding-top
        ?visible="${this.visible}"
        @help-modal-close="${this._handleCloseModal}"
      >
        <div slot="slot-content">${this.visible?this._faqModal:null}</div>
      </bbva-help-modal>
    `}}var pn=g`
:host {
  display: block;
  box-sizing: border-box;
  position: absolute;
  z-index: 100;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class mn extends(D(m(_e(_)))){static get is(){return"payments-mpos-overview-go-to-login-modal"}static get scopedElements(){const t=[kt];return mn.scopedElementsFromClasses(t)}static get properties(){return{visible:{type:Boolean}}}static get styles(){return[pn,$("payments-mpos-overview-go-to-login-modal-shared-styles")]}constructor(){super(),this.visible=!1}_handleCloseModal(t){t.stopPropagation(),this.visible=!1,this._dispatchEvent(`${this.constructor.is}-close`)}render(){return f`
      <bbva-help-modal
        body-text="${this.t(`${this.constructor.is}-body-text`)}"
        button-text="${this.t(`${this.constructor.is}-button-text`)}"
        header-text="${this.t(`${this.constructor.is}-header-text`)}"
        modal-type="caution"
        title-text="${this.t(`${this.constructor.is}-title-text`)}"
        title-icon="${F()}"
        ?visible="${this.visible}"
        @help-modal-close="${this._handleCloseModal}"
        @help-modal-footer-button-click="${this._handleCloseModal}"
        @modal-state-change="${t=>{t.stopPropagation()}}"
      >
      </bbva-help-modal>
    `}}var un=g`
:host {
  display: block;
  box-sizing: border-box;
  --_payments-mpos-overview-onboarding-general-background-color: var(--payments-mpos-overview-dark-mode-onboarding-background-color, var(--payments-mpos-overview-onboarding-background-color, ${et("colorPrimarySurfaceAmbientDefault",it)}));
  --_payments-mpos-overview-onboarding-dashboard-panel-background-color: var(--payments-mpos-overview-dark-mode-dashboard-panel-background-color, var(--payments-mpos-overview-onboarding-dashboard-panel-background-color, ${et("colorPrimarySurfaceAmbientPressed",it)}));
  --_payments-mpos-overview-onboarding-calculator-tpv-button-color: var(--payments-mpos-overview-dark-mode-calculator-tpv-button-color, var(--payments-mpos-overview-onboarding-calculator-tpv-button-color, bbvaDecisionToken("colorPrimaryAltText01Default", "decisions")));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

button {
  all: unset;
  display: flex;
  align-items: center;
  justify-content: center;
  background: ${et("colorPrimarySurfaceAmbientPressed",it)};
  padding: 0.5rem 0;
}

[data-tag-name=bbva-form-input] {
  margin: 1rem;
  text-align: initial;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

[data-tag-name=bbva-help-tooltip] {
  --bbva-help-tooltip-spacing: 0rem;
  text-align: left;
}
[data-tag-name=bbva-help-tooltip] .tooltip-invoker {
  pointer-events: none;
}
[data-tag-name=bbva-help-tooltip] [data-tag-name=bbva-type-text] {
  color: ${et("colorPrimarySurfaceAmbientPressed",it)};
}

[data-tag-name=bbva-header-category] {
  margin-left: 1rem;
}
[data-tag-name=bbva-header-category].operations-list__date {
  margin-left: 0;
  background-color: initial;
  z-index: 0;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container--custom--primary-ambient--content-bg-color: ${et("colorPrimarySurfaceAmbientDefault",it)};
}

[data-tag-name=bbva-type-icon] {
  --bbva-type-icon-color: bbvaDecisionToken("colorPrimarySurfaceAmbientDefault", "decisions");
}

[data-tag-name=payments-mpos-overview-panel-detail] {
  padding-top: 0.5rem;
  padding-bottom: 0.5rem;
}

.calculator__panel-tooltip {
  --bbva-help-tooltip-spacing: 0;
}
.calculator__panel-tooltip [data-tag-name=payments-mpos-overview-panel-detail] {
  padding-top: 0;
  --payments-mpos-overview-panel-detail-padding: 0 1rem;
  --payments-mpos-overview-panel-detail-content-amount-amount-padding: 0;
}
.calculator__tpvpad-tooltip {
  --bbva-help-tooltip-spacing: 0rem;
}
.calculator__input-tooltip[opened] [data-tag-name=bbva-form-input] {
  padding: 0.5rem 0;
}
.calculator__charge-button-invoker {
  padding: 1rem;
  margin-top: 0.5rem;
}
.calculator__modal {
  --bbva-help-modal-padding-bottom: 0;
}

[data-tag-name=payments-mpos-overview-panel-info] {
  margin-top: 2rem;
  --payments-mpos-overview-panel-info-description-padding: 0.25rem 0;
}

.dashboard__button-row-tooltip {
  --bbva-help-tooltip-spacing: 0rem;
  --bbva-help-tooltip-width: 14.5rem;
  --bbva-help-tooltip-spacing-center: 120%;
}
.dashboard__button-row-tooltip [data-tag-name=tooltip] {
  left: 0.9rem;
}
.dashboard__button-row-invoker {
  background-color: var(--_payments-mpos-overview-onboarding-general-background-color);
}
.dashboard__panel-invoker {
  background-color: var(--_payments-mpos-overview-onboarding-general-background-color);
}
.dashboard__panel-invoker [data-tag-name=payments-mpos-overview-panel-info] {
  padding: 0.5rem 1rem 0.5rem;
  background-color: var(--_payments-mpos-overview-onboarding-dashboard-panel-background-color);
  margin: 0 1rem;
}

.add-button {
  display: flex;
  justify-content: center;
  height: 100%;
  background: var(--payments-mpos-overview-dark-mode-background-secondary-color, var(--payments-mpos-overview-background-color, ${et("colorPrimarySurfaceAmbientDefault",it)}));
}
.add-button > button {
  background-color: inherit;
}
.add-button [data-tag-name=bbva-type-text] {
  font-weight: ${et("fontWeight",y.medium)};
  font-style: var(--fontFacePrimaryMediumFontStyle, ${b(y.medium.fontStyle)});
}

.tpv-pad {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  grid-column-gap: 0.5rem;
  grid-row-gap: 0.5rem;
  padding: 1rem 0.5rem;
}
.tpv-pad > button {
  background: var(--payments-mpos-overview-dark-mode-background-secondary-color, var(--payments-mpos-overview-background-color, ${et("colorPrimarySurfaceAmbientDefault",it)}));
}
.tpv-pad > button [data-tag-name=bbva-type-text] {
  color: var(--_payments-mpos-overview-onboarding-calculator-tpv-button-color);
  --bbva-type-text-font-weight: 500;
}

.fit {
  padding-left: 1rem;
  padding-right: 1rem;
}

.steps {
  display: flex;
  justify-content: space-between;
  padding: 0 1rem;
}
.steps.__chevrons {
  display: flex;
  gap: 1.5rem;
}
`;const vn=500,gn="Cocacola (2)",bn="Cobro con lector de tarjetas",yn="ID:trhh1j8zmqyglcmw3uqv",_n="24-04-2022";class $n extends(D(m(P(K(_e(na(_))))))){static get is(){return"payments-mpos-overview-onboarding"}static get scopedElements(){const t=[bt,Mt,xt,Nt,Dt,St,kt,ge,Gt,lt,dt,Pt,be,As,Fa,ws];return $n.scopedElementsFromClasses(t)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},contentFragmentPathOnboarding:{type:String,attribute:"content-fragment-path-onboarding"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},_currentStep:{type:Number},_isOnboardingCalculatorCompleted:{type:Boolean},_isOnboardingDashboardCompleted:{type:Boolean},_isOnboardingModalCompleted:{type:Boolean}}}constructor(){super(),this.aemHost="",this.contentFragmentPathOnboarding="",this.hasFeatureHeaderHidden=!1,this._closeModalElements=[],this._currentStep=0,this._isOnboardingCalculatorCompleted=!1,this._isOnboardingDashboardCompleted=!1,this._isOnboardingModalCompleted=!1,this._iconBack=Z(),this._iconNext=Q(),this._lastPadRow=[],this._modalVisibility=!1,this._padButtons=[]}static get styles(){return[un,$("dashboard-commons-shared-styles"),$("operations-list-shared-styles"),$("payments-mpos-overview-onboarding-shared-styles"),Et.primaryAlt,pt.primaryAlt,wt.primaryAlt,Ht.primaryAlt,Ct.primaryAlt,ve.primaryAlt,st.primaryAlt,ot.primaryAlt]}static _getButtonTextTpl(t){return f` <bbva-type-text unset size="3XL" text="${t}"></bbva-type-text> `}static _getButtonIconTpl(t){return f` <bbva-type-icon icon="${t}" size="24"></bbva-type-icon> `}firstUpdated(){this._modalVisibility=!0,this.addView(this),this._lastPadRow=[x(),0,w()],this._padButtons=[...Array(9).concat(...this._lastPadRow)]}updated(t){t.has("_currentStep")&&2===this._currentStep&&(this._isOnboardingDashboardCompleted=!0),t.has("_currentStep")&&8===this._currentStep&&(this._isOnboardingCalculatorCompleted=!0),t.has("_isOnboardingCalculatorCompleted")&&this._isOnboardingDashboardCompleted&&this._isOnboardingModalCompleted&&(this._dispatchEvent(`${this.constructor.is}-completed`),this.closeView(this))}_navigateBack(){this._currentStep=8,this._isOnboardingDashboardCompleted=!0,this._isOnboardingModalCompleted=!0,this._isOnboardingCalculatorCompleted=!0}_getPanelinfoTooltipTemplate(){return[{alignment:"center",invokerCustomClass:"dashboard__panel-invoker",description:this.t(`${this.constructor.is}-carousel-tooltip`),heading:this.t(`${this.constructor.is}-carousel-tooltip-header`),rank:0,tpl:this._panelInfoTpl,vertical:"bottom"}]}_getButtonRowTooltipTemplate(){return[{alignment:"left",tooltipCustomClass:"dashboard__button-row-tooltip",invokerCustomClass:"dashboard__button-row-invoker",description:this.t(`${this.constructor.is}-row-tooltip`),heading:this.t(`${this.constructor.is}-row-tooltip-header`),rank:1,tpl:this._buttonRowTpl,vertical:"bottom"}]}get _buttonRowTpl(){const t=[{icon:r(),label:this.t(`${this.constructor.is}-button-charge`)},{icon:l(),label:this.t(`${this.constructor.is}-button-manage-links`)},{icon:d(),label:this.t(`${this.constructor.is}-button-search-movements`)},{icon:W(),label:this.t(`${this.constructor.is}-button-see-more`)}];return f`
      <bbva-button-row
        ambient="primary"
        variant="simple"
        .options="${t}"
      ></bbva-button-row>
    `}_getButtonTpl(t,e){return f`
      <button>
        ${"string"==typeof t?this.constructor._getButtonIconTpl(t):this.constructor._getButtonTextTpl(t??e)}
      </button>
    `}_getTooltipLinkText(){return this.t(`${this.constructor.is}-${7===this._currentStep?"final-step":"next-step"}`)}_getWrappedCalculatorTemplates(){return[{alignment:"center",tooltipCustomClass:"calculator__panel-tooltip",description:this.t(`${this.constructor.is}-panel-tooltip`),heading:this.t(`${this.constructor.is}-panel-tooltip-header`),rank:4,tpl:this._panelDetailTpl},{alignment:"center",tooltipCustomClass:"calculator__input-tooltip",description:this.t(`${this.constructor.is}-amount-tooltip`),heading:this.t(`${this.constructor.is}-amount-tooltip-header`),rank:5,tpl:this._formInputAmountTpl},{alignment:"center",tooltipCustomClass:"calculator__input-tooltip",description:this.t(`${this.constructor.is}-description-tooltip`),heading:this.t(`${this.constructor.is}-description-tooltip-header`),rank:6,tpl:this._formInputDescriptionTpl},{alignment:"center",tooltipCustomClass:"calculator__tpvpad-tooltip",invokerCustomClass:"calculator__tpvpad-invoker",description:this.t(`${this.constructor.is}-calculator-tooltip`),heading:this.t(`${this.constructor.is}-calculator-tooltip-header`),rank:2,tpl:this._tpvPadTpl},{alignment:"center",invokerCustomClass:"calculator__charge-button-invoker",description:this.t(`${this.constructor.is}-button-tooltip`),heading:this.t(`${this.constructor.is}-button-tooltip-header`),rank:7,tpl:this._buttonDefaultTpl}]}_wrappedElementWithTooltip(t){return t.map((({alignment:t,description:e,heading:i,invokerCustomClass:a,rank:s,tooltipCustomClass:o,tpl:n,vertical:r})=>f`
        <bbva-help-tooltip
          attached=""
          avoid-clickable
          class="${L({[`${o}`]:!!o})}"
          horizontal-placement="${M(t)}"
          heading="${i}"
          link-text="${this._getTooltipLinkText()}"
          vertical-placement="${M(r)}"
          ?opened="${s===this._currentStep&&this._isOnboardingModalCompleted}"
          @help-tooltip-link-click="${t=>{t.stopPropagation(),this._currentStep+=1}}"
          ><bbva-type-text
            class="description"
            size="S"
            unset
            text="${this.t(e)}"
          ></bbva-type-text>
          <div
            slot="invoker"
            class="tooltip-invoker ${L({[`${a}`]:!!a})}"
          >
            ${n}
          </div></bbva-help-tooltip
        >
      `))}get _headerMainButtons(){return[{id:`${this.constructor.is}-btn-help`,icon:E(),accessibilityText:this.t(`${this.constructor.is}-faqs`)},{id:`${this.constructor.is}-btn-menu`,icon:J(),accessibilityText:this.t(`${this.constructor.is}-global-menu`)}]}get _isCalculatorComplete(){return this._isOnboardingDashboardCompleted&&!this._isOnboardingCalculatorCompleted}get _isDashboardComplete(){return this._isOnboardingModalCompleted&&!this._isOnboardingCalculatorCompleted}get _isOnboardingComplete(){return!this._isOnboardingModalCompleted&&this._modalVisibility}get _onboardingModalTpl(){return f`
      <onboarding-full-screen-carousel
        modal-title="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-help-modal-title`)}"
        content-fragment-host="${this.aemHost}"
        content-fragment-path="${this.contentFragmentPathOnboarding}"
        ?native="${this.native}"
        ?visible="${this._isOnboardingComplete}"
        @onboarding-full-screen-carousel-close="${t=>{t.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-completed`)}}"
        @global-cells-full-screen-carousel-activate="${t=>{t.stopPropagation(),this._isOnboardingModalCompleted=!0}}"
      ></onboarding-full-screen-carousel>
    `}get _onboardingCalculatorTpl(){return this._isCalculatorComplete?f`
          <bbva-help-modal
            class="calculator-modal"
            fixed-footer
            full-height
            header-type="modal"
            hide-content-padding-top
            i-o-s-fixed-header
            visible
            .closeModalElements="${this._closeModalElements}"
          >
            <div slot="slot-content">
              ${this._wrappedElementWithTooltip(this._getWrappedCalculatorTemplates())}
            </div>
          </bbva-help-modal>
        `:f``}get _carouselStepsTpl(){return f`
      <div class="steps">
        <bbva-step-bar items="2" scroll-position="0" selected="0" columns="1" ?loop="false">
        </bbva-step-bar>
        <div class="__chevrons">
          <bbva-button-default
            aria-controls="carouselSlides"
            icon="${this._iconBack}"
            variant="icon no-background"
          >
          </bbva-button-default>

          <bbva-button-default
            aria-controls="carouselSlides"
            icon="${this._iconNext}"
            variant="icon no-background"
          >
          </bbva-button-default>
        </div>
      </div>
    `}get _onboardingDashboardTpl(){return f`
      <bbva-transition-container
        reset-scroll
        ?visible="${this._isDashboardComplete}"
        .closeModalIndex="${this._closeModalElements}"
      >
        <div slot="slot-content">
          ${this._wrappedElementWithTooltip(this._getPanelinfoTooltipTemplate())}
          ${this._carouselStepsTpl}
          ${this._wrappedElementWithTooltip(this._getButtonRowTooltipTemplate())}
          ${this._getDashboardHeaderCategory} ${this._operationsList}
        </div>
      </bbva-transition-container>
    `}get _panelInfoTpl(){return f`
      <slot name="slot-header">
        <bbva-header-main
          variant="first-level-sequential"
          text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-dashboard-header`)}"
          .buttons="${this._headerMainButtons}"
          show-left-icon
        ></bbva-header-main>
      </slot>
      <payments-mpos-overview-panel-info
        description="${this.t(`${this.constructor.is}-carousel-description`)}"
        heading-level-title="L"
        link-text="${this.t(`${this.constructor.is}-carousel-link`)}"
        content-title="${this.t(`${this.constructor.is}-carousel-title`)}"
      ></payments-mpos-overview-panel-info>
    `}get _panelDetailTpl(){return f`
      <div slot="slot-header">
        <bbva-header-main
          variant="modal-initial"
          text="${this.hasFeatureHeaderHidden?"":this.t(`${this.constructor.is}-calculator-title`)}"
        >
        </bbva-header-main>
      </div>
      <payments-mpos-overview-panel-detail
        amount="0"
        currency-code="${this.currencyCode}"
        language="${this.language}"
        local-currency="${this.localCurrency}"
        .description="${[{text:this.t(`${this.constructor.is}-tax`)},{amount:"0.00",text:this.t(`${this.constructor.is}-total-amount`)}]}"
      ></payments-mpos-overview-panel-detail>
    `}get _formInputDescriptionTpl(){return f`
      <bbva-form-input
        ambient="primary-alt"
        type="text"
        label="${this.t(`${this.constructor.is}-description`)}"
      ></bbva-form-input>
    `}get _formInputAmountTpl(){return f`
      <bbva-form-input
        ambient="primary-alt"
        label="${this.t(`${this.constructor.is}-units`)}"
        type="number"
      ></bbva-form-input>
    `}get _getItemDetailTpl(){return f`
      <payments-mpos-overview-item-detail
        amount-type="completed"
        amount="${vn}"
        badge="Completed"
        badge-type="default"
        currency-code="${this.currencyCode}"
        date="${_n}"
        ellipsis
        heading="${gn}"
        language="${this.language}"
        link
        local-currency="${this.localCurrency}"
        second-subtitle="${yn}"
        subtitle="${bn}"
      ></payments-mpos-overview-item-detail>
      <div class="fit">
        <bbva-divider-default></bbva-divider-default>
      </div>
    `}get _operationsList(){return f`
      <bbva-header-category
        class="operations-list__date"
        heading-level="2"
        text="${this.t(`${this.constructor.is}-header-date`)}"
        variant="date"
      ></bbva-header-category>
      ${[...Array(2)].map((()=>this._getItemDetailTpl))}
    `}get _tpvPadTpl(){return f`
      <div class="tpv-container">
        <div class="tpv-pad">
          ${this._padButtons.map(((t,e,i)=>i.length-1===e?this._wrappedElementWithTooltip([{invokerCustomClass:"add-button",description:this.t(`${this.constructor.is}-add-tooltip`),heading:this.t(`${this.constructor.is}-add-tooltip-header`),rank:3,tpl:this._getButtonTpl(t,e)}]):this._getButtonTpl(t,e+1)))}
        </div>
      </div>
    `}get _getDashboardHeaderCategory(){return f`
      <bbva-header-category
        has-help
        heading-level="2"
        text="${this.t(`${this.constructor.is}-last-charges`)}"
      ></bbva-header-category>
    `}get _buttonDefaultTpl(){return f`
      <div slot="slot-footer">
        <bbva-button-default fullwidth text="${this.t(`${this.constructor.is}-charge`)}">
        </bbva-button-default>
      </div>
    `}render(){return f`
      ${this._onboardingModalTpl} ${this._onboardingDashboardTpl} ${this._onboardingCalculatorTpl}
    `}}var fn=g`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

[data-tag-name=payments-mpos-overview-panel-info] {
  --payments-mpos-overview-panel-info-content-panel-box-shadow: none;
}
`;class kn extends(D(_e(m(K(_))))){static get is(){return"payments-mpos-overview-no-client-modal"}static get scopedElements(){const t=[be];return kn.scopedElementsFromClasses(t)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},contentFragmentPathNotLogged:{type:String,attribute:"content-fragment-path-not-logged"},visible:{type:Boolean}}}constructor(){super(),this.aemHost="",this.contentFragmentPathNotLogged="",this.visible=!1}static get styles(){return[fn,$("payments-mpos-overview-no-client-modal-shared-styles")]}render(){return f`
      <onboarding-full-screen-carousel
        modal-title="${this.t(`${this.constructor.is}-header`)}"
        content-fragment-host="${this.aemHost}"
        content-fragment-path="${this.contentFragmentPathNotLogged}"
        ?native="${this.native}"
        ?visible="${this.visible}"
        @onboarding-full-screen-carousel-close="${t=>{t.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-close`),this.visible=!1}}"
        @global-cells-full-screen-carousel-activate="${t=>{t.stopPropagation(),this._dispatchEvent(`${this.constructor.is}-close`),this.visible=!1}}"
        @hide-loader="${()=>this._dispatchEvent(`${this.constructor.is}-load`)}"
      ></onboarding-full-screen-carousel>
    `}}var wn=g`
:host {
  display: block;
  box-sizing: border-box;
  height: 100%;
  width: 100%;
  --bbva-progress-content-z-index: 50;
  --payments-mpos-overview-background-color: var(--_payments-mpos-overview--_ambient--background-color, var(--payments-mpos-overview-dark-mode-background-color, ${et("colorPrimarySurfaceAmbientDefault",it)}));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-notification-container] {
  z-index: 20;
}
`;class xn extends(K(tt(m(sa(Qi(_e(Zi(na(ra(_)))))))))){static get is(){return"payments-mpos-overview"}static get scopedElements(){const t=[kt,po,an,dn,hn,$n,kn,mn,ws,...xn.configurationScopedElements()];return xn.scopedElementsFromClasses(t)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},applicationId:{type:String,attribute:"application-id"},commission:{type:Number},componentId:{type:String,attribute:"component-id"},contentFragmentPathFaqs:{type:String,attribute:"content-fragment-path-faqs"},contentFragmentPathNotLogged:{type:String,attribute:"content-fragment-path-not-logged"},contentFragmentPathOnboarding:{type:String,attribute:"content-fragment-path-onboarding"},customerId:{type:String,attribute:"customer-id"},filterTypeStatusLink:{type:Array,attribute:"filter-type-status-link"},fromDate:{type:String,attribute:"from-date"},hasFeatureHeaderHidden:{type:Boolean,attribute:"has-feature-header-hidden"},hostOpenPay:{type:String,attribute:"host-open-pay"},localCurrency:{type:String,attribute:"local-currency"},pageSize:{type:Number,attribute:"page-size"},redirectUrl:{type:String,attribute:"redirect-url"},reusableThirdPartyServiceId:{type:String,attribute:"reusable-third-party-service-id"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},taxTypes:{type:Array,attribute:"tax-types"},thirdPartyProducts:{type:Array,attribute:"third-party-products"},thirdPartyProviderId:{type:String,attribute:"third-party-provider-id"},thirdPartyServiceId:{type:String,attribute:"third-party-service-id"},userSettingsEnabled:{type:Boolean,attribute:"user-settings-enabled"},validPeriodTypes:{type:Array,attribute:"valid-period-types"},viewBusinessIntelligence:{type:Boolean,attribute:"view-business-intelligence"},viewDigitalSales:{type:Boolean,attribute:"view-digital-sales"},viewMode:{type:String,attribute:"view-mode"},_currencyCode:{type:String,attribute:"currency-code"},_datePickerData:{type:Object},_datePickerError:{type:Object},_featureIsReloading:{type:Boolean},_hasBeenCheckedStorageNoData:{type:Boolean},_hasBeenCheckedJWSStorage:{type:Boolean},_hasTopUnavailable:{type:Boolean},_hasToUpdateOperationsList:{type:Boolean},_isBackFromChargeZone:{type:Boolean},_isNotClientVisible:{type:Boolean},_isOnboarding:{type:Boolean},_isSdkReady:{type:Boolean},_isTopReady:{type:Boolean},_isTopInitRequestDone:{type:Boolean},_isBackFromLogin:{type:Boolean},_navigateToConfiguration:{type:Boolean},_navigateToManageLinks:{type:Boolean},_isRefundCancelled:{type:Boolean},_showFaqsModal:{type:Boolean},_showGoToLoginModal:{type:Boolean},_showSpinnerCarousel:{type:Boolean},_showToastUserSettings:{type:Boolean},_showTopInfoMessage:{type:Boolean},_showView:{type:Boolean},_singleUseJws:{type:String},_storagedData:{type:Object},_storagedJWS:{type:Array}}}static get styles(){return[wn,$("payments-mpos-overview-shared-styles")]}constructor(){super(),this.aemHost="",this.ambient="primary",this.applicationId="",this.commission=0,this.componentId="",this.config={loader:!0,notifyFeature:!0},this.contentFragmentPathFaqs="",this.contentFragmentPathNotLogged="",this.contentFragmentPathOnboarding="",this.customerId="",this.filterTypeStatusLink=[],this.fromDate="",this.hasFeatureHeaderHidden=!1,this.host="",this.hostOpenPay="",this.localCurrency="",this.pageSize=10,this.redirectUrl="",this.requiredToken="tsec",this.reusableThirdPartyServiceId="",this.showHelpFaqs=!1,this.taxTypes=[],this.thirdPartyProducts=[],this.thirdPartyProviderId="",this.thirdPartyServiceId="",this.userSettingsEnabled=!1,this.validPeriodTypes=[],this.viewBusinessIntelligence=!1,this.viewDigitalSales=!1,this.viewMode=Ze,this._apiVersion=1,this._currencyCode="",this._datePickerData={},this._datePickerError={},this._featureIsReloading=!1,this._hasBeenCheckedJWSStorage=!1,this._hasBeenCheckedStorageNoData=!1,this._hasTopProduct=!1,this._hasToUpdateOperationsList=!1,this._hasTopUnavailable=!1,this._isBackFromChargeZone=!1,this._isBackFromLogin=!1,this._offerHasBeenShown=!1,this._isLoginRedirect=!1,this._isNotClientVisible=!1,this._isOnboarding=!1,this._isRefundCancelled=!1,this._isSdkReady=!1,this._isTopInitRequestDone=!1,this._isTopReady=!1,this._isTransactionsListCallFiltered=!1,this._navigateToConfiguration=!1,this._navigateToManageLinks=!1,this._notifificationToastHandler=this._handleNotificationToastClose.bind(this),this._selected=0,this._showFaqsModal=!1,this._showGoToLoginModal=!1,this._showSpinnerCarousel=!1,this._showTopInfoMessage=!1,this._showToastUserSettings=!1,this._showView=!1,this._singleUseJws="",this._storagedData={},this._storagedJWS=[]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getFromLocalStorage(li),this.getFromLocalStorage(di,!0),this.addEventListener("notification-toast-close",this._notifificationToastHandler)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("notification-toast-close",this._notifificationToastHandler)}firstUpdated(){this._overviewDm=this.shadowRoot.querySelector(`[data-tag-name="${dn.is}"]`),this._origin=this.viewMode,this._currencyCode=this.localCurrency,this.viewMode===Ze&&this.showLoader()}updated(t){var e;(t.has("customerId")||t.has("_isBackFromLogin"))&&this.customerId&&this._isBackFromLogin&&this._isLoginRedirect&&(this._isLoginRedirect=!1,this._isBackFromLogin=!1,null===(e=this._overviewDm)||void 0===e||e.repeatLastCall());t.has("thirdPartyProducts")&&this.thirdPartyProducts.find((t=>"TAP_ON_PHONE"===t.id))&&(this._hasTopProduct=!0),t.has("isNotTopBlockingError")&&this.isNotTopBlockingError&&(this._isTopInitRequestDone=!0,this.setShouldCallInitTop(this.isNotTopBlockingError))}init(){this._initialize&&(this._hasBeenCheckedStorageNoData=!0,this._initialize=!1),this._initializeRetrySSO&&(this.retrySSO(),this._initializeRetrySSO=!1),this._isLoginRedirect&&!this.customerId&&(this._isLoginRedirect=!1,this._overviewDm.repeatLastCall()),!this._offerHasBeenShown||this._initialize||this._initializeRetrySSO||Object.keys(this._storagedData).length&&(!0!==this._storagedData.isOpenPayUser||1!==Object.keys(this._storagedData).length)||this.resetState()}loginSuccess(){this._isBackFromLogin=!0}retrievedStoredMercurioMposData(t){Object.values(t).length?this._storagedData=t:this._hasBeenCheckedStorageNoData=!0}retrievedStoredMercurioMposDataError(){this._hasBeenCheckedStorageNoData=!0,this.setMerchantsTtl(Ri())}sdkInitResponse(){this._isSdkReady=!0,this.resolveCallInitSdk(),this._hasTopProduct?this.callInitTop():this.clearLoader()}topInitResponse(t){const{isNfcEnabled:e}=t;this._isTopReady=!0,!e&&this.getShouldCallInitTop()?this.resolveExecuteTopChargeError({code:97}):this.resolveCallInitTop(),this._hasTopUnavailable&&(this._showTopInfoMessage=!0,this._dispatchEvent(`${Fe}-action-footprint`,{view:"available-top-again"}),this.setPropertyToStore("unavailableTop",!1)),this._isTopInitRequestDone=!0,this.clearLoader()}topInitResponseError(t){this._isTopInitRequestDone=!0,this.resolveInitTopError(t),this.clearLoader()}retrievedStoredJWS(t){this._storagedJWS=t,this._hasBeenCheckedJWSStorage=!0}retrievedStoredJWSError(){this._hasBeenCheckedJWSStorage=!0}retryMerchants(){this._overviewDm.callMerchants()}retryUserSettingsGet(){this._overviewDm.callGetUserSettings()}retryUserSettingsPut(){this._overviewDm.putUserSettings()}retrySingleUseSSO(){this._handleSingleUseJwsRequest()}retrySSO(){this._overviewDm.callSSO()}clearSpinner(){this.clearLoader()}setDatePickerData(t){this._datePickerData=t}resetState(){this._hasBeenCheckedStorageNoData=!1,this._featureIsReloading=!this._offerHasBeenShown,this._isSdkReady=!1,this._isTopReady=!1,this._isTopInitRequestDone=!1,this._showView=!1,this._storagedData={},this._storagedJWS=[],this.getFromLocalStorage(li)}setDatePickerError(t){this._datePickerError=t}leaveThePageFromError(){this._initialize=!0,this._hasBeenCheckedStorageNoData=!1,this._dispatchEvent(`${Fe}-leave`)}leaveThePageFromSSOError(){this._initializeRetrySSO=!0,this._dispatchEvent(`${Fe}-leave`)}cancelSingleUseSSORetry(){this._isRefundCancelled=!0}_handleSingleUseJwsRequest(){this.showLoader(oi),this._singleUseJws="",this._overviewDm.callSSO({onlyOneUse:!0})}_handleChangeMerchant(t){this._showSpinnerCarousel=!0,this._isMerchantChanged=!0,this.setSelectedMerchant(t),this._overviewDm.callSSOWithTTLValidate({id:t})}_handleManageLinksNavigation(){this.clearNavigationStack(),this._navigateToManageLinks=!0,this.viewMode=Qe}_putUserSettings(t){this._overviewDm.putUserSettings(t)}_handleNotificationToastClose(){this._showToastUserSettings=!1}_handleResponsesDm(t){const{showOnboarding:e,unavailableTop:i}=t.detail;this._isOnboarding=e,this._hasTopUnavailable=i,this._showView=!0,this._featureIsReloading=!1,this.callInitSdk()}_closeChargeZone(){this._origin===Qe&&(this.viewMode=this._origin,this._isBackFromChargeZone=!0)}_toggleFaqModalVisibility(){this._showFaqsModal=!this._showFaqsModal}get _commissionRatio(){return this.commission/100}get _onboardingTpl(){return this._isOnboarding&&this._isSdkReady?f`
          <payments-mpos-overview-onboarding
            aem-host="${this.aemHost}"
            content-fragment-path-onboarding="${this.contentFragmentPathOnboarding}"
            currency-code="${this._currencyCode}"
            language="${this.language}"
            local-currency="${this.localCurrency}"
            ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
            ?native="${this.native}"
            @payments-mpos-overview-onboarding-completed="${()=>this.setPropertyToStore("isOnboardingDone",!0)}"
          ></payments-mpos-overview-onboarding>
        `:f``}get _noClientTpl(){return this._isNotClientVisible?f`
          <payments-mpos-overview-no-client-modal
            aem-host="${this.aemHost}"
            content-fragment-path-not-logged="${this.contentFragmentPathNotLogged}"
            ?native="${this.native}"
            ?visible="${this._isNotClientVisible}"
            @payments-mpos-overview-no-client-modal-load="${()=>{this.clearLoader()}}"
            @payments-mpos-overview-no-client-modal-close="${()=>{this._isNotClientVisible=!1,this._dispatchEvent(`${Fe}-offer-page-navigate`)}}"
          ></payments-mpos-overview-no-client-modal>
        `:f``}get _calculatorTpl(){return this._showView?f`
          <payments-mpos-overview-charge-zone
            commission="${this._commissionRatio}"
            is-calculator-visible
            language="${this.language}"
            redirect-url="${this.redirectUrl}"
            ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
            ?is-refund-cancelled="${this._isRefundCancelled}"
            ?is-top-ready="${this._isTopReady||this.isNotTopBlockingError}"
            .currencyCode="${this._currencyCode}"
            .executedChargeData="${this.executedChargeData}"
            .localCurrency="${this.localCurrency}"
            .sdkErrorResponse="${this.sdkErrorResponse}"
            .singleUseJws="${this._singleUseJws}"
            .taxTypes="${this.taxTypes}"
            .validPeriodTypes="${this.validPeriodTypes}"
            @payments-mpos-overview-sdk-error-modals-user-close="${()=>{this.sdkErrorResponse={},this.clearNavigationStack(),this.viewMode=Qe}}"
            @payments-mpos-overview-sdk-not-controlled-error="${()=>{this.sdkErrorResponse={}}}"
            @payments-mpos-overview-execute-charge-max-retrys-error-common-modal-show="${()=>{this.clearLoader(),this.clearNavigationStack(),this.sdkErrorResponse={},this.viewMode=Qe}}"
            @payments-mpos-overview-calculator-exit-calculator="${()=>{this.clearNavigationStack(),this.sdkErrorResponse={},this.viewMode=Qe}}"
            @payments-mpos-overview-charge-zone-close="${()=>this._closeChargeZone()}"
            @payments-mpos-overview-exit-receipt="${()=>{this.clearNavigationStack(),this.sdkErrorResponse={},this.viewMode=Qe}}"
            @payments-mpos-overview-cancelled-link-receipt-manage-links-navigate="${this._handleManageLinksNavigation}"
            @payments-mpos-overview-link-receipt-manage-links-navigate="${this._handleManageLinksNavigation}"
            @payments-mpos-overview-charge-zone-put-user-settings="${t=>this._putUserSettings(t.detail)}"
            @payments-mpos-overview-connect-card-reader-modal-go-to-configuration="${()=>{this.clearNavigationStack(),this._navigateToConfiguration=!0,this.viewMode=Qe}}"
            @payments-mpos-overview-refund-handler-single-use-jws-request="${this._handleSingleUseJwsRequest}"
            @payments-mpos-overview-call-action-error-execute-charge-open="${()=>this._dispatchEvent(`${Fe}-action-footprint`,{view:"charge-error"})}"
            @payments-mpos-overview-calculator-action-step-load="${t=>this._dispatchEvent(`${Fe}-action-step-load`,t)}"
            @payments-mpos-overview-card-reader-receipt-action-step-load="${t=>this._dispatchEvent(`${Fe}-action-step-load`,t)}"
            @payments-mpos-overview-link-receipt-action-step-load="${t=>this._dispatchEvent(`${Fe}-action-step-load`,t)}"
            @payments-mpos-overview-card-reader-receipt-action-load="${t=>this._dispatchEvent(`${Fe}-action-state-load`,t)}"
            @payments-mpos-overview-card-reader-receipt-charge="${()=>this._dispatchEvent(`${Fe}-action-start`,{page:"receipt"})}"
            @payments-mpos-overview-link-receipt-charge="${()=>this._dispatchEvent(`${Fe}-action-start`,{page:"receipt"})}"
            @payments-mpos-overview-link-receipt-action-load="${t=>this._dispatchEvent(`${Fe}-action-state-load`,t)}"
            @payments-mpos-overview-multistep-action-step-load="${t=>this._dispatchEvent(`${Fe}-action-step-load`,t)}"
            @payments-mpos-overview-card-reader-modal-load="${()=>this._dispatchEvent(`${Fe}-action-footprint`,{view:"charge"})}"
            @payments-mpos-overview-multistep-step-payment-link-load="${()=>this._dispatchEvent(`${Fe}-action-footprint`,{view:"step"})}"
            @payments-mpos-overview-refund-handler-refund-cancel="${()=>{this._isRefundCancelled=!1}}"
            @payments-mpos-overview-top-init="${()=>{this.isInitializingTopTransaction=!0,this.showLoader(oi)}}"
          ></payments-mpos-overview-charge-zone>
        `:f``}get _dashboardTpl(){return f`
      <payments-mpos-overview-dashboard
        commission="${this._commissionRatio}"
        currency-code="${this._currencyCode}"
        language="${this.language}"
        selected="${this._selected}"
        visible
        ?dashboard-transactions-list-failed="${this.dashboardTransactionsListFailed}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?has-to-update-operations-list="${this._hasToUpdateOperationsList}"
        ?has-top-product="${this._hasTopProduct}"
        ?is-refund-cancelled="${this._isRefundCancelled}"
        ?is-top-ready="${this._isTopReady}"
        ?isBackFromChargeZone="${this._isBackFromChargeZone}"
        ?loading="${!((!this._hasTopProduct||this._isTopInitRequestDone)&&this._showView&&this._isSdkReady)}"
        ?navigate-to-configuration="${this._navigateToConfiguration}"
        ?navigate-to-manage-links="${this._navigateToManageLinks}"
        ?show-bi-card="${this.viewBusinessIntelligence}"
        ?show-help-faqs="${this.showHelpFaqs}"
        ?show-spinner-carousel="${this._showSpinnerCarousel}"
        ?show-toast-user-settings="${this._showToastUserSettings}"
        ?view-digital-sales="${this.viewDigitalSales}"
        .datePickerData="${this._datePickerData}"
        .datePickerError="${this._datePickerError}"
        .dataUserSettings="${this._dataUserSettings}"
        .filterTypeStatusLink="${this.filterTypeStatusLink}"
        .fromDate="${this.fromDate}"
        .pageSize="${this.pageSize}"
        .sdkErrorResponse="${this.sdkErrorResponse}"
        .singleUseJws="${this._singleUseJws}"
        .taxTypes="${this.taxTypes}"
        .validPeriodTypes="${this.validPeriodTypes}"
        @payments-mpos-overview-transaction-by-id-get="${()=>{this._isTransactionsListCallFiltered=!0}}"
        @payments-mpos-overview-search-results-transactions-list-filtered-get="${()=>{this._isTransactionsListCallFiltered=!0}}"
        @payments-mpos-overview-dashboard-charge="${()=>{this.sdkErrorResponse={},this._dispatchEvent(`${Fe}-action-start`,{page:"dashboard"}),this.viewMode=Ze}}"
        @payments-mpos-overview-dashboard-change-merchant="${t=>this._handleChangeMerchant(t.detail)}"
        @payments-mpos-overview-dashboard-put-user-settings="${t=>this._putUserSettings(t.detail)}"
        @payments-mpos-overview-merchant-ttl-jws-expired="${()=>{this._overviewDm.callSSO()}}"
        @payments-mpos-overview-refund-handler-single-use-jws-request="${this._handleSingleUseJwsRequest}"
        @payments-mpos-overview-dashboard-go-to-calculator="${()=>{this.sdkErrorResponse={},this.viewMode=Ze}}"
        @payments-mpos-overview-dashboard-operations-list-stop-loading="${()=>{this._hasToUpdateOperationsList=!1}}"
        @payments-mpos-overview-dashboard-open-faqs="${this._toggleFaqModalVisibility}"
        @payments-mpos-overview-card-reader-modal-load="${()=>this._dispatchEvent(`${Fe}-action-footprint`,{view:"charge"})}"
        @payments-mpos-overview-dashboard-load="${()=>this._dispatchEvent(`${Fe}-action-footprint`,{view:"dashboard"})}"
        @payments-mpos-overview-sdk-error-modals-user-close="${()=>{this.sdkErrorResponse={}}}"
        @payments-mpos-overview-sdk-not-controlled-error="${()=>{this.sdkErrorResponse={}}}"
        @payments-mpos-overview-dashboard-has-to-update-operations-list-reset="${()=>{this._hasToUpdateOperationsList=!1}}"
        @payments-mpos-overview-operations-list-error-prop-reset="${()=>{this.dashboardTransactionsListFailed=!1}}"
        @payments-mpos-overview-refund-handler-refund-cancel="${()=>{this._isRefundCancelled=!1}}"
        @payments-mpos-overview-refund-handler-top-error-show="${()=>{const t=this.isNotTopBlockingError?{operative:"operationError"}:{code:9999};this.resolveApplyTopRefundError(t)}}"
        @payments-mpos-overview-dashboard-navigation-to-config-complete="${()=>{this._navigateToConfiguration=!1}}"
        @payments-mpos-overview-dashboard-navigation-to-manage-links-complete="${()=>{this._navigateToManageLinks=!1}}"
        @payments-mpos-overview-top-init="${()=>{this.showLoader(oi)}}"
      ></payments-mpos-overview-dashboard>
    `}_navigateToLogin(){this._showGoToLoginModal=!1,this._dispatchEvent(`${Fe}-native-login-navigate-${this.viewMode}`,{pageAfterLogin:"cashZonePaymentsMpos"+(this.viewMode===Qe?"Dash":"Calc")})}_manageLoginNavigate(){var t;(t=this.currentView()).length&&"payments-mpos-overview-dashboard"!==t[0].getAttribute("data-tag-name")?this._navigateToLogin():this._showGoToLoginModal=!0}get _faqsModalTpl(){return f`
      <payments-mpos-overview-faqs-modal
        aem-host="${this.aemHost}"
        content-fragment-path-faqs="${this.contentFragmentPathFaqs}"
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?native="${this.native}"
        ?visible="${this._showFaqsModal}"
        @payments-mpos-overview-faqs-modal-close="${this._toggleFaqModalVisibility}"
      ></payments-mpos-overview-faqs-modal>
    `}get _goToLoginModalTpl(){return f`
      <payments-mpos-overview-go-to-login-modal
        ?has-feature-header-hidden="${this.hasFeatureHeaderHidden}"
        ?visible="${this._showGoToLoginModal}"
        @payments-mpos-overview-go-to-login-modal-close="${t=>{t.stopPropagation(),this._showGoToLoginModal=!1,this._navigateToLogin()}}"
      ></payments-mpos-overview-go-to-login-modal>
    `}get _infoTopModalTpl(){return f`<bbva-help-modal
      button-text="${this.t(`${Fe}-top-available-button`)}"
      fixed-footer
      full-height
      header-text="${this.t(`${Fe}-top-available-header`)}"
      modal-type="modal"
      ?visible="${this._showTopInfoMessage}"
    >
      <div slot="slot-content">
        <payments-mpos-overview-panel-info
          content-title="${this.t(`${Fe}-top-available-content`)}"
          description="${this.t(`${Fe}-top-available-description`)}"
          heading-level-title="3XL"
          image-size="M"
          microillustration="info"
        >
        </payments-mpos-overview-panel-info>
      </div>
    </bbva-help-modal>`}render(){return f`
      ${super.render()}
      <payments-mpos-overview-dm
        ?native="${this.native}"
        ?reset-call="${this._featureIsReloading}"
        ?user-settings-enabled="${this.userSettingsEnabled}"
        .apiVersion="${this._apiVersion}"
        .applicationId="${this.applicationId}"
        .componentId="${this.componentId}"
        .customerId="${this.customerId}"
        .hasBeenCheckedStorageNoData="${this._hasBeenCheckedStorageNoData}"
        .hasBeenCheckedJWSStorage="${this._hasBeenCheckedJWSStorage}"
        .host="${this.host}"
        .pageSize="${this.pageSize}"
        .products="${this.thirdPartyProducts}"
        .requiredToken="${this.requiredToken}"
        .reusableThirdPartyServiceId="${this.reusableThirdPartyServiceId}"
        .storagedData="${this._storagedData}"
        .storagedJWS="${this._storagedJWS}"
        .thirdPartyProviderId="${this.thirdPartyProviderId}"
        .thirdPartyServiceId="${this.thirdPartyServiceId}"
        .viewMode="${this.viewMode}"
        @payments-mpos-overview-dm-login-navigate="${()=>{this._isLoginRedirect=!0,this._manageLoginNavigate()}}"
        @payments-mpos-overview-dm-responses-success="${t=>this._handleResponsesDm(t)}"
        @payments-mpos-overview-dm-merchants-no-data="${()=>{this._isNotClientVisible=!0,this._offerHasBeenShown=!0}}"
        @payments-mpos-overview-dm-sso-success="${()=>{this._showSpinnerCarousel=!1,this._isMerchantChanged&&(this._hasToUpdateOperationsList=!0,this._isMerchantChanged=!1)}}"
        @payments-mpos-overview-dm-user-settings-put-success="${t=>{this._dataUserSettings=t.detail,this._showToastUserSettings=!0}}"
        @payments-mpos-overview-dm-single-use-sso-success="${t=>{const{jws:e}=t.detail;this._singleUseJws=e}}"
      ></payments-mpos-overview-dm>
      ${this[`_${this.viewMode}Tpl`]}${this._onboardingTpl}${this._noClientTpl}${this._faqsModalTpl}${this._goToLoginModalTpl}
      ${this._infoTopModalTpl}
    `}}customElements.define("payments-mpos-overview",xn);class Tn extends _{static get is(){return"bbva-manager-cash-zone"}static get properties(){return{countryCode:{type:String},nativeIos:{type:Boolean},sdkEnvironment:{type:String}}}constructor(){super(),this.countryCode="",this.sdkEnvironment="",this.nativeIos=!1,this._mposAppSettings={},this._shareFileName="",this._openPayPhoneHelp=""}get _lowercaseCountryCode(){return this.countryCode.toLowerCase()}openCallAction(){const t=this._openPayPhoneHelp.replace(/[\s()]+/g,"");this._dispatch("open-dialer",{value:t})}getDataToGenerateImage(t){const{result:e,operative:i}=this.constructor._calculateOperativeAndResult(t),a=new Date,s=a.getFullYear(),o=String(a.getMonth()+1).padStart(2,"0"),n=String(a.getDate()).padStart(2,"0"),r=String(a.getHours()).padStart(2,"0"),l=String(a.getMinutes()).padStart(2,"0"),d=String(a.getSeconds()).padStart(2,"0");this._shareFileName=`${i}_${s}${o}${n}_${r}${l}${d}.png`,this._dispatch("get-image-set-result",e),setTimeout((()=>this._dispatch("get-image-capture-receipt",{operative:i})),100)}manageLocalStorageGet(t){this._dispatch("get-from-storage",t)}manageLocalStorageSet(t){const{key:e,value:i}=t,a={...t};"mercurioJWS"===e&&this.nativeIos&&(a.value=JSON.stringify(i)),this._dispatch("set-in-storage",a)}manageMercurioMPOSSuccess(t){this._dispatch("storage-get-mercurio-mpos-success",t)}manageMercurioMPOSError(t){this._dispatch("storage-get-mercurio-mpos-error",t)}manageMercurioJWSSuccess(t){const e=this.nativeIos?JSON.parse(t):t;this._dispatch("storage-get-mercurio-jws-success",e)}manageMercurioJWSError(t){this._dispatch("storage-get-mercurio-jws-error",t)}navigateBackFromNative(t){const{value:{cancelledNavigation:{currentPage:e}}}=t;e.includes("cashZonePaymentsMpos")&&this._dispatch("navigate-go-back-from-native")}resolveImageAndOpenSocialShare(t){const e={shareContent:[{source:"raw",filename:this._shareFileName,content:t.receipt}]};this._dispatch("open-native-social-share",e)}sendURLSocialShare(t){const e={shareContent:[{source:"url",content:t}]};this._dispatch("open-native-social-share",e)}setMposAppSettingsData(t){var e;this._mposAppSettings={...null===(e=t.cashZone)||void 0===e?void 0:e.mpos},Object.entries(this._mposAppSettings).forEach((([t,e])=>{"openPayPhoneHelp"===t&&(this._openPayPhoneHelp=e),this._dispatch(`set-${t}`,e)}))}sdkInit(t){const e={country:this._lowercaseCountryCode,environment:t.environment,device:"mpos"};this._dispatch("sdk-init",e)}static _calculateOperativeAndResult(t){const{operative:e,fields:i}=t,{operation:a,amount:s,paymentDate:o,sendDate:n}=i;return{operative:e,result:{operation:a,amount:s,paymentDate:o,sendDate:n}}}openDatePicker(t){const{dateFormat:e,defaultDate:i,maxDate:a,minDate:s,origin:o,type:n}=t;this._origin=o,this._type=n,this._dispatch("open-native-datepicker",{dateFormat:e,defaultDate:i,maxDate:a,minDate:s||"1970-01-01"})}resolveDatePicker(t){this._dispatch("resolve-datepicker",{origin:this._origin,type:this._type,...t}),this._origin=null,this._type=null}rejectDatePicker(t){this._dispatch("reject-datepicker",{origin:this._origin,type:this._type,...t}),this._origin=null,this._type=null}_dispatch(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}}customElements.define(Tn.is,Tn);class Sn extends(ye(_)){static get is(){return"bbva-analyticmanager-cash-zone-payments-mpos"}constructor(){super(),this.appStartedText=""}manageSteps({detail:t}={}){const{step:e,typology:i,amount:a,currency:s,process:o}=t;this.currentStep=e,this.dependsOnAppStartedLaunched=!(1===this.currentStep),1===this.currentStep&&this.resetData();const n=`${this.currentStep} ${this.config.items.stepValues[this.currentStep]}`;this.persistData({step:n,level3:n,...i?{typology:i}:{},...a?{amount:a}:{},...s?{currency:s}:{},...o?{process:this.config.items.processes[o]}:{}}),this.fireStepLoaded()}manageItemAppStarted(t){this.fireItemAppStarted(t),this.dependsOnAppStartedLaunched=!0}manageAppCompleted({detail:t}={}){var e;const{id:i,state:a}=t;this.persistData({operationNumber:i,state:this.config.items.states[a],..."rejected"===a?{profile:null===(e=this.config.items)||void 0===e?void 0:e.profile}:{}}),this.fireAppCompleted()}manageAppOnClickStart(t){const{page:e}=t;this.resetData(),this.persistData({step:this.config.items.appSteps[e],..."receipt"===e?{level2:this.config.items.receipt.level2,level3:this.config.items.receipt.level3}:{}}),this.fireAppOnClickStart()}managePageView(t){const{view:e}=t;this.firePageView(e)}}customElements.define(Sn.is,Sn);
